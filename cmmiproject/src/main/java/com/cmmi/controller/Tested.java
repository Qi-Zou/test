package com.cmmi.controller;

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
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/Tested")
public class Tested {

    @Autowired
    FileService fileService;

    @RequestMapping(value = "/view")
    public String toTestedView(){
        return "tested";
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
