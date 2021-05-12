package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class GreetingServlet {
    @GetMapping("/home")
    public String getHome(){
        return "home";
    }
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String getUser(@RequestParam String name,Model model ){
        model.addAttribute("name",name);
        return "user";
    }
}
