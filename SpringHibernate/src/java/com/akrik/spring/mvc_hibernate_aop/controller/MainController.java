package com.akrik.spring.mvc_hibernate_aop.controller;


import com.akrik.spring.mvc_hibernate_aop.entity.Employee;
import com.akrik.spring.mvc_hibernate_aop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    private EmployeeService employeeService;



    @RequestMapping("/")
    public String showAllEmps(Model model) {
        List<Employee> allEmps = employeeService.getAllEmployees();
        Collections.sort(allEmps, Comparator.comparingInt(Employee::getId));

        model.addAttribute("allEmps", allEmps);

        return "show_all_emps";
    }


    @RequestMapping("/add_new_emp")
    public String addNewEmployee(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "emp_info";
    }

    @RequestMapping("/save_emp")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }

    @RequestMapping("/update_emp")
    public String updateEmployee(@RequestParam("empId") int id, Model model) {
        Employee employee = employeeService.getEmployeeById(id);
        model.addAttribute("employee", employee);
        return "emp_info";
    }


    @RequestMapping("/delete_emp")
    public String deleteEmployee(@RequestParam("empId") int id) {
        employeeService.deleteEmployee(id);
        return "redirect:/";
    }
}
