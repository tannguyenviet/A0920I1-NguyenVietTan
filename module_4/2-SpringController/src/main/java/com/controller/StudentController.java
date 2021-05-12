package com.controller;

import com.model.Student;
import com.service.StudentService;
import com.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;
    @RequestMapping()
    public String getList(Model model){
//        StudentService studentService = new StudentServiceImpl();
        model.addAttribute("students",studentService.getAll());
        return "/student/list";
    }
    @RequestMapping(value = "/student/delete/{id}",method = RequestMethod.GET)
    public ModelAndView deleteStudent(@PathVariable String id){
        ModelAndView modelAndView = new ModelAndView("redirect:/student");
        studentService.deleteStudentById(id);
        return modelAndView;
    }
    @RequestMapping(value = "/student/create",method = RequestMethod.GET)
    public ModelAndView viewCreateStudentForm(){
        return new ModelAndView("/student/create");
    }
    @RequestMapping(value = "/student/create",method = RequestMethod.POST)
    public ModelAndView CreateNewStudent(@RequestParam String id,@RequestParam String name,@RequestParam int age){
        ModelAndView modelAndView = new ModelAndView("/student/list");
        studentService.addNewStudent(new Student(id,name,age));
        modelAndView.addObject("students",studentService.getAll());
        return modelAndView;
    }
//    @RequestMapping(value = "/studen/delete",method = RequestMethod.GET)
//    public
}

