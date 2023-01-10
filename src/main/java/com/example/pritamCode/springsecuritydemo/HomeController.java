package com.example.pritamCode.springsecuritydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "This is Home page";
    }

    @GetMapping("/admin")
    public String admin(){
        return "this is admin page";
    }
}
