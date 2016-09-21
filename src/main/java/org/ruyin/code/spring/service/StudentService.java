package org.ruyin.code.spring.service;

import java.util.List;

import org.ruyin.code.spring.bean.Student;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.REQUIRED)
public interface StudentService {

	public void save(Student stu) throws Exception;
	
	public List<Student> getStudent();
}
