package com.cmmi.controller;


import com.cmmi.model.Employees;
import com.cmmi.service.FileService;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class FileOperations {

    public boolean fileDown(String fileName, HttpServletRequest request, HttpServletResponse response) throws IOException {
        //下载文件的路径
        String path = request.getSession().getServletContext().getRealPath("WEB-INF\\File")+"\\"+fileName;

        //获取输入流
        java.io.File file=new java.io.File(path);
        InputStream bis = new BufferedInputStream(new FileInputStream(file));
        //转码，免得文件名中文乱码
//        fileName = URLEncoder.encode(fileName,"UTF-8");
        fileName = URLEncoder.encode(fileName, StandardCharsets.UTF_8.toString());
        //设置文件下载头
//        response.addHeader("Content-Disposition","attachment;filename="+fileName);
        response.addHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode(fileName, "UTF-8"));
        //1、设置文件ContentType类型，这样设置，会自动判断下载文件类型
        response.setContentType("multipart/form-data");
        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
        int len = 0;
        while ((len = bis.read()) != -1){
            out.write(len);
            out.flush();
        }
        out.close();
        System.out.println("fileName = " + fileName);
        return true;
    }

    public boolean fileUpload(String analysis ,MultipartFile file, HttpSession session, HttpServletRequest request,FileService fileService) throws IOException {
        //获取上传文件人的实体类
        Employees employees = (Employees) session.getAttribute("employees");
        if(!file.isEmpty()){
            System.out.println("文件名:"+file.getName());
            System.out.println("questionAnalaysis="+analysis);
            //将文件存储在某个位置
            String path =request.getSession().getServletContext().getRealPath("WEB-INF\\File\\");
            System.out.println("文件上传位置："+path);
            //获取当前时间
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //getInputStream()，文件流;  System.currentTimeMillis() 时间戳

            String fileName = System.currentTimeMillis() + file.getOriginalFilename();
//            上传文件
            FileUtils.copyInputStreamToFile(file.getInputStream(),new File(path,fileName));
//            实例化自己的fileModel
            com.cmmi.model.File fileModel = new com.cmmi.model.File();
//            填充fileModel的属性值
            fileModel.setUploadId(employees.getJobNumber());
            fileModel.setFileUrl(fileName);
            fileModel.setFileType(employees.getType());
            fileModel.setFileExplain(analysis);
            fileModel.setCount(0);
            fileModel.setUploadTime(sdf.format(date));
            System.out.println(fileModel.toString());
//          调用service层
            fileService.saveFile(fileModel);
        }
        return true;
    }
}
