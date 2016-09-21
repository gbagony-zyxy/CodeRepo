package org.ruyin.code.spring.service;

import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.ruyin.code.spring.bean.Student;
import org.ruyin.code.spring.db.StudentRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentServiceImp implements StudentService{

	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource){
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public void save(Student stu) throws Exception{
		jdbcTemplate.update("insert into user(name,age,email) values(?,?,?)",new Object[]{stu.getUsername(),stu.getAge(),stu.getEmail()},
				new int[]{Types.VARCHAR,Types.INTEGER,Types.VARCHAR});
		
		throw new RuntimeException("aa");
	}

	@Override
	public List<Student> getStudent() {
		List<Student> list = jdbcTemplate.query("select * from user", new StudentRowMapper());
		return list;
	}

}
