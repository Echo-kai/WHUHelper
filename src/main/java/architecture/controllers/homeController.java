package architecture.controllers;

import architecture.WebRecord;
import architecture.pojo.Order;
import architecture.pojo.User;
import architecture.service.OrderService;
import architecture.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/home")
public class homeController {
    @Autowired
    OrderService orderService;

    @Autowired
    UserService userService;

    WebRecord webRecord = WebRecord.getWebRecord();

    @GetMapping
    public String displayHome(Model model, HttpServletRequest request){
        webRecord.comeHomePage();
        //System.out.println(request.getSession().getAttribute("username"));
        //System.out.println(request.getSession().getAttribute("userid"));
        model.addAttribute("username",request.getSession().getAttribute("username"));
        model.addAttribute("userid",request.getSession().getAttribute("userid"));
        return "home";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/login";
    }

    @GetMapping("/myRelease")
    public String showRelease(HttpServletRequest request){
        return "release";
    }

    @GetMapping("/myAccept")
    public String showAccept(){
        return "accept";
    }

    @GetMapping("/getAccept")
    @ResponseBody
    public Map<String, Object> getAccept(HttpServletRequest request){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code",0);
        map.put("msg","");
        map.put("data",orderService.getAcceptOrder((Long)request.getSession().getAttribute("userid")));
        return map;
    }

    @GetMapping("/getRelease")
    @ResponseBody
    public Map<String,Object> getRelease(HttpServletRequest request){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code",0);
        map.put("msg","");
        map.put("data",orderService.getAllSelfOrder((Long)request.getSession().getAttribute("userid")));
        return map;
    }

    @GetMapping("/getAllOrders")
    @ResponseBody
    public Map<String,Object> getAllOrders() {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code",0);
        map.put("msg","");
        map.put("data",orderService.getAllOrder());
        return map;
    }

    @GetMapping("/fixOrder/{orderId}")
    public String fixOrder(@PathVariable(name ="orderId")Long orderId,Model model){
        model.addAttribute("order",orderService.displayOrderByOrderId(orderId));
        return "fixOrder";
    }

    @PostMapping("/fixOrder/{orderId}")
    public String fixOrder(@PathVariable(name ="orderId")Long orderId,@ModelAttribute(value="order") Order order,HttpServletRequest request){
        order.setBelong((Long)request.getSession().getAttribute("userid"));
        order.setId(orderId);
        order.setCreatTime(new Date());
        orderService.updateOrder(order);
        return "redirect:/home";
    }

    @GetMapping("/acceptOrder/{orderId}")
    public String acceptOrder(@PathVariable(name="orderId") Long orderId,HttpServletRequest request){
        Order order = orderService.displayOrderByOrderId(orderId);
        orderService.userAccepted(order.getId(),(Long)request.getSession().getAttribute("userid"),order.getBelong());
        return "redirect:/home";
    }

    @GetMapping("/detail/{id}")
    public String showDetail(@PathVariable(name="id") Long id, Model model,HttpServletRequest request){
        Order order = orderService.displayOrderByOrderId(id);
        User user = userService.getUser(order.getBelong());
        model.addAttribute("owner",user.getUsername());
        model.addAttribute("oneOrder",order);
        model.addAttribute("nowUserId",request.getSession().getAttribute("userid"));
        int flag=0;
        List<Long> orders = orderService.getAllAcceptOrders();
        if(orders.contains(id)){
            user =userService.getUser(orderService.getOrderAccepter(id));
            System.out.println(user);
            model.addAttribute("accepter",user.getUsername());
            flag = 1;
        }
        model.addAttribute("flag",flag);
        return "detail";
    }

    @GetMapping("/delete/{id}")
    public String deleteOrder(@PathVariable(name = "id")Long orderId){
        orderService.deleteOrder(orderId);
        return "release";
    }

    @GetMapping("/addOrder")
    public String addOrder(Model model){
        model.addAttribute("order",new Order());
        return "addOrder";
    }

    @PostMapping("/addOrder")
    public String insertOrder(@ModelAttribute(value="order") Order order,
                              HttpServletRequest request){
        order.setBelong((Long)request.getSession().getAttribute("userid"));
        order.setCreatTime(new Date());
        orderService.addOrder(order);
        System.out.println(order);
        return "redirect:/home";
    }

}
