package com.example.Bootdemo.repository;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Bootdemo.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	List<Student> findByName(String name);
	List<Student> findByAge(String age);
	
	List<Student> findByAgeGreaterThan(int age);
	
	List<Student> findByAgeLessThan(int age);
	
	List<Student> findByAgeEquals(int age);
	
	List<Student> findByAgeBetween(int age1,int age2);
	
	List<Student> findByAgeGreaterThanEqual(int age);
	
	List<Student> findByAgeLessThanEqual(int age);

}
