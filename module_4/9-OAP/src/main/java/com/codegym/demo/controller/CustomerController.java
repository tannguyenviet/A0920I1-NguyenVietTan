package com.codegym.demo.controller;

import com.codegym.demo.exception.DuplicateEmailException;
import com.codegym.demo.service.impl.CustomerServiceIpml;
import com.codegym.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerServiceIpml customerService;

    @GetMapping("/")
    public String index(Model model) {
        String success = (String)model.asMap().get("success");

        List customerList = customerService.findAll();
        System.out.println("Vao index"+customerList.size());
        model.addAttribute("success",success);
        System.out.println("sussecess"+success);
        model.addAttribute("customers", customerList);
        return "/customer/index";
    }
    @GetMapping("/customer/create")
    public String create(Model model) {
        model.addAttribute("customer", new Customer());
        return "/customer/create";
    }
    @PostMapping("/customer/save")
    public RedirectView save(Customer customer , RedirectAttributes redirectAttributes) throws DuplicateEmailException {
            redirectAttributes.addFlashAttribute("success","Add Customer Success!");
            customerService.save(customer);
        return new RedirectView("/");
    }
    @GetMapping("/customer/{id}/edit")
    public String edit(@PathVariable int id, Model model) {

        try {
            model.addAttribute("customer", customerService.findById(id));
            return "/customer/edit";

        } catch (Exception e) {
            return "redirect:/";
        }
    }
    @PostMapping("/customer/update")
    public String update(Customer customer) {
        customerService.update(customer);
        return "redirect:/";
    }
//    @GetMapping("/customer/{id}/delete")
//    public String delete(@PathVariable int id, Model model) {
//        model.addAttribute("customer", customerService.findById(id));
//        return "/customer/delete";
//    }
    @PostMapping("/customer/delete")
    public String delete(Customer customer, RedirectAttributes redirect) {
        customerService.remove(customer.getId());
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/";
    }
    // Handle exception
    @ExceptionHandler(DuplicateEmailException.class)
    public ModelAndView showInputNotAcceptable() {
        return new ModelAndView("customer/inputs-not-acceptable");
    }
//    @GetMapping("/customer/{id}/view")
//    public String view(@PathVariable int     id, Model model) {
//        model.addAttribute("customer", customerService.findById(id));
//        return "/customer/view";
//    }
}
