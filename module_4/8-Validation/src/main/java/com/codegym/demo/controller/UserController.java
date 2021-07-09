package com.codegym.demo.controller;

import com.codegym.demo.model.User;
import com.codegym.demo.repository.BlogRepository;
import com.codegym.demo.repository.UserRepository;
import com.codegym.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    UserServiceImpl userService;
    @GetMapping(value = "/user")
    public String viewList(Model model){

        model.addAttribute("users",userService.findAllUser());
        return "user/list";
    }
    @GetMapping(value = "/user/create")
    public String viewCrete(Model model ){
        model.addAttribute("user",new User());
        return "user/create";
    }
    @PostMapping(value = "/user/save")
    public String saveUser(@Validated User user,BindingResult bindingResult,Model model){
        new User().validate(user,bindingResult);
        if(bindingResult.hasFieldErrors()){
            model.addAttribute("user",user);
            return "/user/create";
        }
        else{
            userService.saveUser(user);
            return "redirect:/user";

        }
    }

}
