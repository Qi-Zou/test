package com.cmmi.controller;

import com.cmmi.model.Employees;
import com.cmmi.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/cmmiproject")
public class Login {
    @Autowired
    private EmployeesService employeesService;

    @RequestMapping(value = "/loginView")
    public String toLoginPage(){
        return "login";
    }

    @RequestMapping(value = "login")
    public String login(@RequestParam("jobNumber")String jobNumber, HttpSession session, @RequestParam("password")String password, Model model){
        System.out.println("jobNumber="+jobNumber+";password:"+password);

        Employees employees = employeesService.getEmployees(jobNumber);
        if(employees != null) {
            System.out.println(employees.toString());
            if (password != null && password.equals(employees.getPassword().trim())) {
                session.setAttribute("employees",employees);
                return "main";
            } else {

                return "login";
            }
        }else{
            return "login";
        }

    }

}
