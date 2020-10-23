package architecture.controllers;

import architecture.pojo.User;
import architecture.service.UserService;
import architecture.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {

    UserService userService = null;

    @Autowired
    TestController(UserService _userService){
        this.userService = _userService;
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(Long id){
        return userService.getUser(id);
    }

    @RequestMapping("/getpwd")
    @ResponseBody
    public String getPassword(Long id){
        return userService.getPassword(id);
    }

    @RequestMapping("/getAll")
    @ResponseBody
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
}
