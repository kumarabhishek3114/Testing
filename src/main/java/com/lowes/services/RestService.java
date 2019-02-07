package com.lowes.services;

import java.util.Hashtable;
import org.springframework.stereotype.Service;
import com.lowes.model.*;

@Service
public class RestService {
	
	Hashtable<String,Student> students = new Hashtable<>();
	Integer length = 0;
	
	public boolean addStudent(Student s) {
		this.length++;
		this.students.put(this.length.toString(), s);
		return true;
	}

}
