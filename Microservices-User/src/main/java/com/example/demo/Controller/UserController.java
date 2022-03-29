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

import com.example.demo.Entity.UserDepartment;
import com.example.demo.Entity.Users;
import com.example.demo.Service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	
	@Autowired
	private UserService userServ;
	
	
	@GetMapping("/")
	public List<Users> findAll()
	{
		return userServ.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Users> findById(@PathVariable("id") int id) {
		return userServ.findById(id);
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Users u)
	{
		userServ.save(u);
	}
	
	@GetMapping("/dep/{userid}")
	public UserDepartment getUserDetailsWithDepartment(@PathVariable("userid") int userid) {
		return userServ.getUserDetailsWithDepartment(userid);
	
		
	}
}
