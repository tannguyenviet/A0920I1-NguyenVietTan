package com.example.demo.controller;

import com.example.demo.model.Service;
import com.example.demo.service.ServiceTypeService;
import com.example.demo.service.impl.RentTypeImpl;
import com.example.demo.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ServiceController {
    @Autowired
    ServiceImpl serviceService;
    @Autowired
    ServiceTypeService serviceTypeService;
    @Autowired
    RentTypeImpl rentTypeService;
    @GetMapping("/service")
    public String ViewListService(Model model, @PageableDefault(value = 5) Pageable pageable, @RequestParam(required = false) String key_search, @RequestParam(required = false) String typeId) {
        System.out.println("Key_search"+key_search);
        System.out.println(typeId);
        String message = (String)model.asMap().get("message");
        model.addAttribute("services",serviceService.findAllService(pageable));
        model.addAttribute("message",message);
        model.addAttribute("page",pageable);
        return "/service/list";
    }
    @GetMapping("service/create")
    public String viewCreateForm(Model model){
        model.addAttribute("service",new Service());
        model.addAttribute("serviceTypes",serviceTypeService.findAllListServiceType());
        model.addAttribute("typeServices",serviceTypeService.findAllListServiceType());
        model.addAttribute("rentTypes",rentTypeService.findAllListRentType());
        return "/service/create";
    };
    @PostMapping("service/save")
    public RedirectView saveService(Model model, Service service, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message","Create Success Service! ");
        serviceService.saveService(service);
        return new RedirectView("/service");
    }
    @GetMapping("service/delete/{id}")
    public String viewDeleteForm(Model model, @PathVariable String id){
        model.addAttribute("service",serviceService.findServiceById(id));
        return "/service/delete";
    }
    @PostMapping("service/delete/{id}")
    public RedirectView saveService(Model model,@PathVariable String id,RedirectAttributes redirectAttributes){
        serviceService.deleteServiceById(id);
        redirectAttributes.addFlashAttribute("message","Delete Success Service!");
        return new RedirectView("/service");
    }
    @GetMapping("/service/edit/{id}")
    public String viewEditForm(Model model,@PathVariable String id){
        model.addAttribute("service",serviceService.findServiceById(id));
        model.addAttribute("serviceTypes",serviceTypeService.findAllListServiceType());
        return "/service/edit";
    }
    @PostMapping("/service/edit")
    public RedirectView editService(RedirectAttributes redirectAttributes,Service service){
        System.out.println("service Id :"+service.getId());
        System.out.println("Service type"+service.getServiceType().getName());
        redirectAttributes.addFlashAttribute("message","Edit Service Success!");
        serviceService.saveService(service);
        return new RedirectView("/service");
    }
}
