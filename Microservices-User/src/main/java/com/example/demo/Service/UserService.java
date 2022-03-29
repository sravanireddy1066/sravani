package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Entity.Departments;
import com.example.demo.Entity.UserDepartment;
import com.example.demo.Entity.Users;
import com.example.demo.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private RestTemplate restTemplate;
	public List<Users> findAll(){
		return userRepo.findAll();
	}
	
	
	public void save(Users u) {
	userRepo.save(u);
	
}
 
	public UserDepartment getUserDetailsWithDepartment(int userid) {
		
		Users user = userRepo.findById(userid).get();
		
		String url = "http://DEPARTMENT/departments/" + user.getDepartmentid();
		
		Departments dept = restTemplate.getForObject(url, Departments.class);
		
		UserDepartment user_dept= new UserDepartment(dept,user);
		
		return user_dept;
	}

	public Optional<Users> findById(int id) {
		
		return userRepo.findById(id);
	}
}