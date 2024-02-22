package com.example.Bootdemo.repository;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Bootdemo.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	List<Student> findByName(String name);
	List<Student> findByAge(String age);
}
