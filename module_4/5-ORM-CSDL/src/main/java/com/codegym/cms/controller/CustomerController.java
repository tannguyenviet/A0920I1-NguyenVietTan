package com.codegym.cms.controller;

import com.codegym.cms.model.Customer;
import com.codegym.cms.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerServiceImpl customerService;

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
    public RedirectView save(Customer customer , RedirectAttributes redirectAttributes) {
        customer.setId((long)(Math.random() * 10000));
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("success","Add Customer Success!");
        return new RedirectView("/");
    }
    @GetMapping("/customer/{id}/edit")
    public String edit(@PathVariable long id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "/customer/edit";
    }
    @PostMapping("/customer/update")
    public String update(Customer customer) {
        customerService.update(customer);
        return "redirect:/";
    }
    @GetMapping("/customer/{id}/delete")
    public String delete(@PathVariable long id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "/customer/delete";
    }
    @PostMapping("/customer/delete")
    public String delete(Customer customer, RedirectAttributes redirect) {
        customerService.remove(customer.getId());
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/";
    }
    @GetMapping("/customer/{id}/view")
    public String view(@PathVariable long id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "/customer/view";
    }

}
