package org.ruyin.code.spring;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;

import org.ruyin.code.spring.bean.Student;

public class ObtainBeanInfo {

	public static void main(String[] args) throws IntrospectionException {
		BeanInfo beanInfo = Introspector.getBeanInfo(Student.class);
		System.out.println(beanInfo);
	}
}
