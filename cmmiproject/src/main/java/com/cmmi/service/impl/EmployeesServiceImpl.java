package com.cmmi.service.impl;

import com.cmmi.mapper.EmployeesMapper;
import com.cmmi.model.Employees;
import com.cmmi.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeesServiceImpl implements EmployeesService {



    public EmployeesServiceImpl() {
        System.out.println("this is emploeesserviceImpl");
    }


    @Autowired
    private EmployeesMapper employeesMapper;

    @Override
    public Employees getEmployees(String jobNumber) {
        return employeesMapper.selectByPrimaryKey(jobNumber);
    }
}
