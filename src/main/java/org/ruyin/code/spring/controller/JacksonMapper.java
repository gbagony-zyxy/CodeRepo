package org.ruyin.code.spring.controller;

import org.ruyin.code.spring.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ruyin on 2017/3/24.
 */
@Controller
@RequestMapping("/jackson")
public class JacksonMapper {

    @RequestMapping("/object")
    @ResponseBody
    public Object mapperJsonData(){
        Student stu = new Student(1,"ruyin",24,"ruyin@gmail.com");
        return stu;
    }

    @RequestMapping("/string")
    public String mapperSimpleData(){
        return "convert";
    }

    //拦截器可拦截该种类型请求
    @RequestMapping("/{userId}/getInfo")
    @ResponseBody
    public Object getUserInfo(@PathVariable("userId")int userId, HttpServletRequest request){
        return new Student(userId,"ggfly",22,request.getAttribute("status").toString());
    }
}
