package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@RequestMapping("/")
	public String empManagement()
	{
		return "index.jsp";
	}
	
	@RequestMapping("/addEmp")
	public String appEmployee(Employee e)
	{
		System.out.print(e);
		employeeRepository.save(e);
		return "index.jsp";
	}
	
	@RequestMapping("/searchEmp")
	@ResponseBody
	public List<Employee> getEmployees(int pageNo, int pageSize, String sortBy)
	{
		Pageable sortedByGiven = 
				  PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
		
		 Page<Employee> pagedResult = employeeRepository.findAll(sortedByGiven);
         
	        if(pagedResult.hasContent()) {
	            return pagedResult.getContent();
	        } else {
	            return new ArrayList<Employee>();
	        }
		
		
	}

}
