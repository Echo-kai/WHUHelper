package architecture.controllers;

import architecture.pojo.Order;
import architecture.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/getAllOrders")
    @ResponseBody
    public List<Order> getAllOrders() {
        return orderService.getAllOrder();
    }
}
