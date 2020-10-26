package architecture.controllers;

import architecture.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class loginController {

    @Autowired
    UserService userService = null;

    @GetMapping
    public String loginPageGet(){
        return "login";
    }

    @PostMapping
    public String loginProcess(@RequestParam("username") String name,
                               @RequestParam("password") String password,
                               Model model,
                               HttpSession session){
        if(password.equals(userService.getPasswordByUsername(name))){
            session.setAttribute("userid",userService.getIdByUsername(name));
            session.setAttribute("username",name);
            return "redirect:/home";
        }
        else{
            model.addAttribute("msg","用户名或者密码错误");
            return "login";
        }
    }
}
