package com.codegym.demo.controller;

import com.codegym.demo.model.Counter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("mycounter")
public class CounterController {

    /* add MyCounter in model attribute */
    @ModelAttribute("mycounter")
    public Counter setUpCounter() {
        return new Counter();
    }

    @GetMapping("/")
    public String get(@ModelAttribute("mycounter") Counter myCounter) {
        myCounter.increment();
        return "index";
    }
}
