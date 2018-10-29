package com.cmmi.controller;

import com.cmmi.model.Employees;
import com.cmmi.service.FileService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/RequirementAnalysis")
public class RequirementAnalysis {

    @RequestMapping(value = "/view")
    public String toRequirementAnalysisView(){
        return "requirement_analysis";
    }

    @Autowired
    FileService fileService;

    @RequestMapping(value = "/fileUpload",method = RequestMethod.POST)
    public String fileUpload(@RequestParam("question_analysis") String question_analysis , @RequestParam("file") MultipartFile file, HttpSession session, Model model, HttpServletRequest request) throws IOException {
        //获取上传文件人的实体类
        Employees employees = (Employees) session.getAttribute("employees");
        FileOperations fileOperations = new FileOperations();
        String message = null;
        if(fileOperations.fileUpload(question_analysis,file,session,request,fileService)){
            message = "success";
        }
          model.addAttribute("fileName",file.getOriginalFilename());
          model.addAttribute(message);
        return "requirement_analysis";
    }

}
