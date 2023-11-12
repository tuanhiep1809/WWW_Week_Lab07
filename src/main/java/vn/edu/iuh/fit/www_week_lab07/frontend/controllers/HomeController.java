package vn.edu.iuh.fit.www_week_lab07.frontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping
    public String home() {
        return "client/index";
    }

    @GetMapping("/login")
    public String login(){
        return "client/login";
    }
}
