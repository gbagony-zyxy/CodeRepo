package org.ruyin.code.spring.controller;

import org.ruyin.code.spring.bean.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ruyin on 2017/3/24.
 */
@RestController
@RequestMapping("/jackson")
public class JacksonMapper {

    @RequestMapping("/object")
    public Object mapperJsonData(){
        Student stu = new Student(1,"ruyin",24,"ruyin@gmail.com");
        return stu;
    }
}
