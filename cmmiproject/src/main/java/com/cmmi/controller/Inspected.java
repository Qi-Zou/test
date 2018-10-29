package com.cmmi.controller;

import com.cmmi.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/Inspected")
public class Inspected {
    @Autowired
    private EmployeesService employeesService;

    @RequestMapping(value = "/view")
    public String toInspectedView(){
        return "inspected";
    }




}
