package architecture.controllers;

import architecture.WebRecord;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/home")
public class homeController {

    WebRecord webRecord = WebRecord.getWebRecord();

    @GetMapping
    public String displayHome(Model model){
        webRecord.comeHomePage();
        return "home";
    }
}
