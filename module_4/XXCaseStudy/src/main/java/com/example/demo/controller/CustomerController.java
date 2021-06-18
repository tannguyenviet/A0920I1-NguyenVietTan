package com.example.demo.controller;

import com.example.demo.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CustomerController {
    @Autowired
    CustomerServiceImpl customerService;
    @GetMapping("/customer")
    public String ViewListCustomer(Model model, @PageableDefault(value = 5)Pageable pageable){
        model.addAttribute("customers",customerService.findAllCustomer(pageable));
        return "/customer/list";
    }
}
