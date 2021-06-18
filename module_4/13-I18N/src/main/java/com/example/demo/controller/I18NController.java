package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class I18NController {
    @GetMapping(value = "/")
    public String ViewIndex(){
        return "/login";
    }
}
