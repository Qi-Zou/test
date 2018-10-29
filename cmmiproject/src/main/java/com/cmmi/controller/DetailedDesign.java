package com.cmmi.controller;

import com.cmmi.mapper.FileMapper;
import com.cmmi.model.Employees;
import com.cmmi.model.File;
import com.cmmi.service.EmployeesService;
import com.cmmi.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/DetailedDesign")
public class DetailedDesign {
    @Autowired
    FileService fileService;

    @RequestMapping(value = "/view")
    public String toDetailedDesignView(HttpSession session, Model model){
        Employees employees = (Employees) session.getAttribute("employees");
        List<File> fileList = new ArrayList<File>();
        int type = employees.getType()-1;
        System.out.println("*******************type = "+type);
        if(type > 6 || type < 2){
            fileList = null;
        }else{
            fileList = fileService.findByFileType(type);
            System.out.println("****************fileListSize = "+fileList.size());
        }
        if(fileList != null)
            model.addAttribute(fileList);

        return "detailed_design";
    }

    @RequestMapping("fileDown")
    public String fileDown(@RequestParam("fileName") String fileName, HttpServletRequest request, HttpServletResponse response) throws IOException {
        fileName = new String(fileName.getBytes("ISO-8859-1"), "utf-8");

        FileOperations fileOperations = new FileOperations();
        String message = null;
        if(fileOperations.fileDown(fileName,request,response)){
            message = "success";
        }
        return "redirect:view/";
    }


    @RequestMapping("fileUpload")
    public String fileUpload(@RequestParam("analysis") String analysis , @RequestParam("file") MultipartFile file, HttpSession session, Model model, HttpServletRequest request) throws IOException {
        FileOperations fileOperations = new FileOperations();
        String message = null;
        if(fileOperations.fileUpload(analysis,file,session,request,fileService)){
            message = "success";
        }
        model.addAttribute("fileName",file.getOriginalFilename());
        model.addAttribute(message);
        return "redirect:view/";
    }



}
