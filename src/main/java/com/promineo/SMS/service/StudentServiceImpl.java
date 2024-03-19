package com.promineo.SMS.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.promineo.SMS.entity.Student;
import com.promineo.SMS.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {

	
	private StudentRepository studentRepository;
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository=studentRepository;
	}
	//the READ function
	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	//Create
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	//UPDATE
	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}
	@Override
	public Student getStudentById(Integer id) {
		return studentRepository.findById(id).get();
	}
	//DELETE
	@Override
	public void deleteStudentById(Integer id) {
		studentRepository.deleteById(id);
		
	}
}


