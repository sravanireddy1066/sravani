package com.example.demo.Entity;

public class UserDepartment {
  
	
	private Departments dep;
	private Users user;
	
	
	public UserDepartment()
	{
		
	}
	
	
	public Departments getDep() {
		return dep;
	}

	public void setDep(Departments dep) {
		this.dep = dep;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	
	
	public UserDepartment(Departments dep, Users user) {
		super();
		this.dep = dep;
		this.user = user;
	}
	
	
}
