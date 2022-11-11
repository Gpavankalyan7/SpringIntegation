package com.SpringIntegration.Model;

public class Student {

	
//	private static final long serialVersionUID=-7408851479146003262L;
	
	private String id;
	 
	private String name;
	
	private String school;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
/*
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
*/
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", school=" + school + "]";
	}
	
	
	
}
