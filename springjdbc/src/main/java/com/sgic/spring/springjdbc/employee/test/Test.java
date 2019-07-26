package com.sgic.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sgic.spring.springjdbc.employee.dao.EmployeeDao;
import com.sgic.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/sgic/spring/springjdbc/employee/test/config.xml");
		EmployeeDao dao=(EmployeeDao) context.getBean("employeeDao");
//		Employee employee =new Employee();
//		employee.setId(2);
//		employee.setFirstName("testing");
//		employee.setLastName("hello123");
//		int result=dao.create(employee);
//		System.out.println("Number of records inserted are :"+result);
		
//		int result=dao.update(employee);
//		System.out.println("Number of records updated are :"+result);
		
//		int result=dao.delete(1);
//		System.out.println("Number of records deleted are :"+result);
		
//		Employee employee =dao.read(2);
//		System.out.println("Employee Record: "+employee);
//		
		
		List<Employee> result =dao.read();
		System.out.println("Employee Record:" +result);
	};

}
