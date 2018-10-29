package com.cmmi.mapper;

import java.util.List;

import com.cmmi.model.Employees;
import com.cmmi.model.EmployeesExample;
import org.apache.ibatis.annotations.Param;

public interface EmployeesMapper {
    long countByExample(EmployeesExample example);

    int deleteByExample(EmployeesExample example);

    int deleteByPrimaryKey(String jobNumber);

    int insert(Employees record);

    int insertSelective(Employees record);

    List<Employees> selectByExample(EmployeesExample example);

    Employees selectByPrimaryKey(String jobNumber);

    int updateByExampleSelective(@Param("record") Employees record, @Param("example") EmployeesExample example);

    int updateByExample(@Param("record") Employees record, @Param("example") EmployeesExample example);

    int updateByPrimaryKeySelective(Employees record);

    int updateByPrimaryKey(Employees record);
}