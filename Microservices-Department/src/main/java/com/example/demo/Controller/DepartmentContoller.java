package com.example.demo.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Departments;

import com.example.demo.Service.DepartmentServiceImpl;

@RestController
@RequestMapping("/departments")
public class DepartmentContoller {

	
	@Autowired 
	private  DepartmentServiceImpl depServ;
	
	
	@GetMapping("/")
	public List<Departments> findAll()
	{
		return depServ.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Departments> findById(@PathVariable("id") int id) {
		return depServ.findById(id);
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Departments d)
	{
		depServ.save(d);
	}
	
}
