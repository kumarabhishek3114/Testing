package com.lowes.model;

import java.util.List;

public class Student {
	
	private String name;
	private int age;
	private int rollNumber;
	private String department;
	private Subject subject;
	
	public Student(String name,int rollNumber,int age,String department) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.age = age;
		this.department = department;
		this.subject = new Subject();
	}
	
	public boolean addMainSubject(String sub) {
		if(this.subject.containsInMain(sub)) {
			return false;
		}else {
			this.subject.addMainSubject(sub);
			return true;
		}
	}
	
	public boolean addOptionalSubject(String sub) {
		if(this.subject.containsInOptional(sub)) {
			return false;
		}else {
			this.subject.addOptionalSubject(sub);
			return true;
		}
	}
	
	public boolean addMainSubjectList(List<String> sub) {
		if(this.subject.isMainNull()) {
			this.subject.addMainSubject(sub);
			return true;
		}else {
			boolean added = false;
			for(String s:sub) {
				if(this.subject.containsInMain(s)) {
					this.subject.addMainSubject(s);
					if(!added) {
						added = true;
					}
				}
			}
			if(added) {
				return true;
			}else {
				return false;
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
