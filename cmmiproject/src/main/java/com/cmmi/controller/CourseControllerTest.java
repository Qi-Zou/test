package com.cmmi.controller;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.Map;

//@Controller
//@RequestMapping("/courses")
//  /courses/**
public class CourseControllerTest {
//
//    private static Logger log = LoggerFactory.getLogger(CourseController.class);
//    private CourseService courseService;
//    @Autowired
//    public void setCourseService(CourseService courseService){
//        this.courseService = courseService;
//    }
//
//    //本方法将处理/courses/view?courseId=123
//    @RequestMapping(value = "/view",method = RequestMethod.GET)
//    public String viewCourse(@RequestParam("courseId") Integer courseId, Model model){
//        log.debug("In viewCourse,courseId={}",courseId);
//        Course course = courseService.getCoursebyId(courseId);
//        model.addAttribute(course);
//
//        return "course_overview";
//    }
//    //  /courses/view2/{courseId}
//    @RequestMapping(value = "/view2/{courseId}",method = RequestMethod.GET)
//    public String viewCourse2(@PathVariable("courseId") Integer courseId, Map<String,Object> model){
//        log.debug("In viewCourse2,courseId={}",courseId);
//        Course course = courseService.getCoursebyId(courseId);
//        model.put("course",course);
//        return "course_overview";
//    }
//
//    //courses/view3?courseId=456形式的URL
//    @RequestMapping("view3")
//    public String viewCourse3(HttpServletRequest request){
//
//        Integer courseId = Integer.valueOf(request.getParameter("courseId"));
//        log.debug("In viewCourse3,courseId={}",courseId);
//        Course course = courseService.getCoursebyId(courseId);
//        request.setAttribute("course",course);
//        return "course_overview";
//    }
//
//    @RequestMapping(value = "/admin",method = RequestMethod.GET,params = "add")
//    public String createCourse(){
//        return "course_admin/edit";
//    }
//    @RequestMapping(value = "/save",method = RequestMethod.POST)
//    public String doSave(@ModelAttribute Course course){
//
//        log.debug("Info of Course:");
////        log.debug(ReflectionToStringBuilder.toString(course));
//        //在此进行业务操作，比如数据库持久化
//        course.setCourseId(123);
//        System.out.println(course.toString()+"coueseId"+course.getCourseId()+"courseTitle"+course.getTitle());
//
//        //请求重定向：redirect
//        //请求转发：forward
//        return "redirect:view2/"+course.getCourseId();
//    }
//
//    @RequestMapping(value = "/upload",method = RequestMethod.GET)
//    public String showUploadPage(){
//        return "course_admin/File";
//    }
//
//    @RequestMapping(value = "/doUpload",method = RequestMethod.POST)
//    public String doUploadFile(@RequestParam("File") MultipartFile File,Model model, HttpServletRequest request ) throws IOException {
//        //如果文件不为空 , File.isEmpty()表示 文件为空，
//        System.out.println("this is out Test");
//        if(!File.isEmpty()){
//            log.debug("正在处理文件,Process File:{}",File.getOriginalFilename());
//            System.out.println("文件名:"+File.getName());
//            //将文件存储在某个位置
//            String path =request.getSession().getServletContext().getRealPath("WEB-INF\\File\\");
//            System.out.println("文件上传位置："+path);
//            //getInputStream()，文件流;  System.currentTimeMillis() 时间戳
//            FileUtils.copyInputStreamToFile(File.getInputStream(),new File(path,System.currentTimeMillis()+File.getOriginalFilename()));
//        }
//        model.addAttribute("fileName",File.getOriginalFilename());
//        return "success";
//    }
//    @RequestMapping(value = "/download",method = RequestMethod.GET)
//    public String download(@RequestParam(value = "filename") String filename, HttpServletRequest request , HttpServletResponse response) throws IOException {
//        //下载文件的路径
//        String path = request.getSession().getServletContext().getRealPath("WEB-INF\\File")+"\\"+filename;
//
//        //获取输入流
//        File File=new File(path);
//        InputStream bis = new BufferedInputStream(new FileInputStream(File));
//        //转码，免得文件名中文乱码
//        filename = URLEncoder.encode(filename,"UTF-8");
//        //设置文件下载头
//        response.addHeader("Content-Disposition","attachment;filename="+filename);
//        //1、设置文件ContentType类型，这样设置，会自动判断下载文件类型
//        response.setContentType("multipart/form-data");
//        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
//        int len = 0;
//        while ((len = bis.read()) != -1){
//            out.write(len);
//            out.flush();
//        }
//        out.close();
//        return "success";
//    }


}
