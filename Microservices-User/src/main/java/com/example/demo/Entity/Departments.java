package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Department")
public class Departments {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="departmentid")
	private Integer	departmentid;
	@Column(name="departmentname")
	private	 String departmentname;
	@Column(name="departmentaddress")
	private	 String	departmentaddress;
	@Column(name="departmentcode")
	private	 String	departmentcode;
	
	public Departments()
	{
		
	}
	
	
	
	public Integer getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public String getDepartmentaddress() {
		return departmentaddress;
	}
	public void setDepartmentaddress(String departmentaddress) {
		this.departmentaddress = departmentaddress;
	}
	public String getDepartmentcode() {
		return departmentcode;
	}
	public void setDepartmentcode(String departmentcode) {
		this.departmentcode = departmentcode;
	}
	
	public Departments(Integer departmentid, String departmentname, String departmentaddress, String departmentcode) {
		super();
		this.departmentid = departmentid;
		this.departmentname = departmentname;
		this.departmentaddress = departmentaddress;
		this.departmentcode = departmentcode;
	}
	
}
