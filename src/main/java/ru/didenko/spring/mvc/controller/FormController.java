package ru.didenko.spring.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.didenko.spring.mvc.bean.Employee;

@Controller
@RequestMapping("/form")
public class FormController {

    @RequestMapping("/")
    public String showMyView() {
        return "my-view-form";
    }

    @RequestMapping("/askDetails")
    public String askEmpDetails(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "ask-emp-details-view-form";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@ModelAttribute("employee") Employee emp) {
        emp.setName("Mr. " + emp.getName());
        emp.setSurname(emp.getSurname() + " esquire");
        emp.setSalary(emp.getSalary() + 100);

        return "show-emp-details-view-form";
    }

}
