package com.lucentus.magictracker.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    /**
     * Handles GET requests for root path "/"
     * @return the String logical view name, "home"
     */
    @GetMapping("/")
    public String home() {
        return "home";
    }

}
