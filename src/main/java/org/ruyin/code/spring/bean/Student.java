package org.ruyin.code.spring.bean;

public class Student extends User {

	private int id;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public Student() {
		super();
	}
	
	public Student(int id,String name,int age ,String email){
		super(name,email);
		this.id = id;
		this.age = age;
	}

}
