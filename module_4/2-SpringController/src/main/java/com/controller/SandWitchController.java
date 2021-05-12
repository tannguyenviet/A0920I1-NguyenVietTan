package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandWitchController {
    @RequestMapping(value = "/sandwich",method = RequestMethod.GET)
    public String viewIndex(){
        return "/sandwich/index";
    }
    @RequestMapping(value = "/sandwich",method = RequestMethod.POST)
    public String Result(Model model, @RequestParam(required = false) String comdiment){

        model.addAttribute("comdiment",comdiment);
        return "/sandwich/result";

    }
}
