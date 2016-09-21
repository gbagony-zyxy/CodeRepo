package org.ruyin.code.spring.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.ruyin.code.spring.bean.Student;
import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student(rs.getInt("id"),rs.getString("name"),rs.getInt("age"),rs.getString("email"));
		return student;
	}

}
