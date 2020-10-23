package architecture.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class loginController {

    @GetMapping
    public String loginPageGet(Model model){
        return "login";
    }

    @PostMapping
    public String loginProcess(Model model){
        return "redirect:/home";
    }
}
