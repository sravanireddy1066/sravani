package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Departments;

import com.example.demo.Repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl{
	
	@Autowired
	private DepartmentRepository depRepo;
	
	
	public List<Departments> findAll(){
		return depRepo.findAll();
	}
	
	
	public void save(Departments d) {
		depRepo.save(d);
	
}


	public Optional<Departments> findById(int id) {
		
		return depRepo.findById(id);
	}




	
}
