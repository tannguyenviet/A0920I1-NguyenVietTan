package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DictonaryControlller {

    private DicSe dicService;
    @RequestMapping(value = "/dictionary",method = RequestMethod.GET)
    public String viewDictionary(){
        return("/dictionary/index");
    }
    @RequestMapping(value = "/dictionary",method = RequestMethod.POST)
    public ModelAndView getResultDictionary(@RequestParam String key){
        ModelAndView modelAndView = new ModelAndView("/dictionary/result");
//        DictionaryService dictionaryService = new DictionaryService();
        modelAndView.addObject("value",dicService.findValue(key));
        modelAndView.addObject("key",key);
        return modelAndView;
    }
}
