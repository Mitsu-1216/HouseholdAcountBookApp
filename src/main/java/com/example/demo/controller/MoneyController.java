package com.example.demo.controller;

// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MoneyController {
    @GetMapping("/money")
    public String sample() {
        return "money";
    }
}
