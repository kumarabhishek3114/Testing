package com.lowes.model;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private List<String> mainSubjects;
	private List<String> optionalSubject;
	
	public Subject() {
		this.mainSubjects = new ArrayList<String>();
		this.optionalSubject = new ArrayList<String>();
	}
	
	public List<String> showMainSubject(){
		return this.mainSubjects;
	}
	
	public List<String> showOptionalSubject(){
		return this.optionalSubject;
	}
	
	public void addMainSubject(String subject) {
		this.mainSubjects.add(subject);
	}
	
	public void addMainSubject(List<String> subject) {
		this.mainSubjects.addAll(subject);
	}
	
	public void addOptionalSubject(String subject) {
		this.optionalSubject.add(subject);
	}
	
	public void addOptionalSubject(List<String> subject) {
		this.optionalSubject.addAll(subject);
	}
	
	public String deleteMainSubject(String subject) {
		if(this.mainSubjects.contains(subject)) {
			this.mainSubjects.remove(subject);
			return subject;
		}else {
			System.out.println("Didn't find this subject");
			return null;
		}
	}
	
	public boolean containsInMain(String subject) {
		if(this.mainSubjects.contains(subject)) {
			return true;
		}
		return false;
	}
	
	public boolean containsInOptional(String subject) {
		if(this.optionalSubject.contains(subject)) {
			return true;
		}
		return false;
	}
	
	public boolean isMainNull() {
		if(this.mainSubjects.size() == 0) {
			return true;
		}
		return false;
	}
	
	public boolean isOptionalNull() {
		if(this.optionalSubject.size() == 0) {
			return true;
		}
		return false;
	}

}
