package com.jy.springboot_203_employee;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/employeeform")
    public String loadFormPage(Model model)
    {
        model.addAttribute("employee",new Employee());
        return "employeeform";
    }

    @PostMapping("/employeeform")
    public String loadFromPage(@ModelAttribute Employee employee, Model model)
    {
        model.addAttribute("employee",employee);
        return "confirmemployee";
    }
}
