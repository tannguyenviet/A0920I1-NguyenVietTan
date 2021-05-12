package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorMoneyController {
    @RequestMapping(value = "/calculator",method = RequestMethod.GET)
    public String getCalculate(){
        return "/calculator/index";
    }
    @RequestMapping(value = "/calculator",method = RequestMethod.POST)
    public ModelAndView Calculating(@RequestParam int vietnam ){
        ModelAndView modelAndView = new ModelAndView("/calculator/result");
        modelAndView.addObject("vietnam",vietnam);
        modelAndView.addObject("usd",vietnam*23000);
        return  modelAndView;
    }
}
