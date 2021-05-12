package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.CustomerService;

@Controller
public class CustomerController {
    @RequestMapping(value = "/customer")
    public ModelAndView showList(Model model){
        ModelAndView modelAndView = new ModelAndView("list");
        CustomerService customerService = new CustomerService();
        modelAndView.addObject("listCustomer",customerService.getListCustomer());
        return modelAndView;
    }
}
