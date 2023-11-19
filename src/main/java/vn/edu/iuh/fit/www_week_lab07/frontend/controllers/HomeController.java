package vn.edu.iuh.fit.www_week_lab07.frontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client")
public class HomeController {
    @GetMapping("shopping/home")
    public String home() {

        return "client/shopping/shop";
    }

    @GetMapping("/login")
    public String login(){
        return "client/login";
    }
}
