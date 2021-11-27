package com.example.demo.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Employee;
import com.example.demo.repository.HelloRepository;

@Service
public class HelloService {

	@Autowired
	private HelloRepository repository;

	public Employee getEmployee(int id) {
		
		Map<String, Object> target = repository.findById(id);
		
		int employeeId = (Integer) target.get("id");
		String name = (String) target.get("name");
		int age = (Integer) target.get("age");
		
		Employee employee = new Employee();
		employee.setId(employeeId);
		employee.setName(name);
		employee.setAge(age);
		return employee;
	}
}
