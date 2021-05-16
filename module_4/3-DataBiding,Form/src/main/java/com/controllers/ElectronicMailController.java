package com.controllers;

import com.dao.Employee;
import com.dao.Mail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ElectronicMailController {
    @RequestMapping(value = "/mail")
    public String viewForm(Model model){
        model.addAttribute("mail",new Mail());
        List<Integer> pagesizes = new ArrayList<>();
        pagesizes.add(5);
        pagesizes.add(10);
        pagesizes.add(15);
        pagesizes.add(25);
        pagesizes.add(50);
        pagesizes.add(100);
        List<String> languages = new ArrayList<>();
        languages.add("Vietnamese");
        languages.add("English");
        languages.add("France");
        languages.add("Compodia");
        model.addAttribute("languages",languages);
        model.addAttribute("pagesizes",pagesizes);
        return "/mail/create";
    }
    @RequestMapping(value="/createMail")
    public String ViewResult(@ModelAttribute Mail mail,Model model){
        model.addAttribute("language",mail.getLanguage());
        model.addAttribute("pageSize",mail.getPageSize());
        model.addAttribute("enableSpamFilter",mail.getEnableSpamFilter());
        model.addAttribute("signature",mail.getSignature());
        return "/mail/result";
    }
}
