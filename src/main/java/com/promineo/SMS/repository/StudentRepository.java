package com.promineo.SMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.promineo.SMS.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
