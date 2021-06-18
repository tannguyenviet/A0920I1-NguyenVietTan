package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.impl.CustomerServiceIpml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerServiceIpml customerService;

    @GetMapping("/customer")
    public String index(Model model, @RequestParam(value = "language", required = false) String language) {
        String success = (String)model.asMap().get("success");
        if (language == null) {
            language = "en";
        }
        model.addAttribute("language",language);
        List customerList = customerService.findAll();
        model.addAttribute("success",success);
        System.out.println("sussecess"+success);
        model.addAttribute("customers", customerList);
        return "/customer/index";
    }
    @GetMapping("/customer/create")
    public String create(Model model, @RequestParam(value = "language", required = false) String language) {
        model.addAttribute("customer", new Customer());
        if (language == null) {
            language = "en";
        }
        System.out.println("Nhay vao create");
        model.addAttribute("language",language);
        return "/customer/create";
    }
    @PostMapping("/customer/save")
    public RedirectView save(Customer customer , RedirectAttributes redirectAttributes,@RequestParam(value = "language", required = false) String language)  {
            redirectAttributes.addFlashAttribute("success","Add Customer Success!");
            customerService.save(customer);
        return new RedirectView("/customer?language="+language);
    }
    @GetMapping("/customer/{id}/edit")
    public String edit(@PathVariable int id, Model model,@RequestParam(value = "language", required = false) String language) {

        try {
            model.addAttribute("customer", customerService.findById(id));
            model.addAttribute("language",language);
            return "/customer/edit";

        } catch (Exception e) {
            return "redirect:/customer";
        }
    }
    @PostMapping("/customer/update")
    public String update(Customer customer,@RequestParam(value = "language", required = false) String language) {
        customerService.update(customer);
        return ("redirect:/customer?language="+language);
    }
//    @GetMapping("/customer/{id}/delete")
//    public String delete(@PathVariable int id, Model model) {
//        model.addAttribute("customer", customerService.findById(id));
//        return "/customer/delete";
//    }
    @PostMapping("/customer/{id}/delete")
    public String delete(@PathVariable int id, RedirectAttributes redirect,@RequestParam(value = "language", required = false) String language) {
        customerService.remove(id);
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/customer?language="+language;
    }
    // Handle exception
    public ModelAndView showInputNotAcceptable() {
        return new ModelAndView("customer/inputs-not-acceptable");
    }
//    @GetMapping("/customer/{id}/view")
//    public String view(@PathVariable int     id, Model model) {
//        model.addAttribute("customer", customerService.findById(id));
//        return "/customer/view";
//    }
}
