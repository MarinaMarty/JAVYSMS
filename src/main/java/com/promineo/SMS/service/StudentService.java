package com.promineo.SMS.service;

import java.util.List;

import com.promineo.SMS.entity.Student;

public interface StudentService {

	
	//READ
	List<Student> getAllStudents();
	
	//CREATE
	Student saveStudent(Student student);
	
	//UPDATE
	Student updateStudent(Student student);
	Student getStudentById(Integer id);
	
	//DELETE
	void deleteStudentById(Integer id);
}

