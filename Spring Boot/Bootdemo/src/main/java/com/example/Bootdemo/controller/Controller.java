package com.example.Bootdemo.controller;

import java.util.Optional;
import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Bootdemo.dto.Student;
import com.example.Bootdemo.repository.StudentRepository;

@RestController
public class Controller {

	
	StudentRepository sr;
	Controller( StudentRepository sr)
	{ 
		this.sr=sr;
	}
	
	
	@PostMapping("/Hi")
	public String m1() {
		
		return "hellow, Good Morning";
	}
	
	@GetMapping("/Hii")
	public String m2() {
		return "Post Request is Handled";
		
	}
	@PostMapping("/savedata")
	public String save(@RequestBody Student s) {
	sr.save(s);
	return "Data Save Sucessfully";
		
	}
	@GetMapping("/FetchData")
	public Student fetchStudentById(@RequestParam int id) {
		sr.findById(id);
		Optional <Student> op=sr.findById(id);
		Student s=op.get();
		return s;	
	}
	@RequestMapping("/fetchStudName")
	public List<Student> fetchStudentByName(@RequestParam String name)
	{
		List<Student>stud =sr.findByName(name);
		return stud;
		
	}
	@GetMapping("/FindAllStud")
	public List<Student> fetchAllStudent(){
		List<Student>st=sr.findAll();
		return st;
	}
	@RequestMapping("/FindStudAgeGreaterThan")
	public List<Student> fetchDataByAge(@RequestParam int age){
		List<Student>stud=sr.findByAgeGreaterThan(age);
		return stud;
		
	}
	
	@RequestMapping("/FindStudAgeLessThan")
	public List<Student> fetchDataByAgeLess(@RequestParam int age){
		List<Student>stud=sr.findByAgeLessThan(age);
		return stud;
		
		
	//----------------------deleting data------------------------------	
		
		
	}
	@RequestMapping("/DeleteDataByID")
	public String deleteStudent(@RequestParam int id) {
		sr.deleteById(id);
		return "Data Deleted Sucessfully...!!!";
		
	}
	@RequestMapping("/DeleteAllData")
	public String deleteAll() {
		sr.deleteAll();
		return "All Data Deleted ..!!";
	}
	
	//-----------------------------Update Data-------------------------------
	
	@RequestMapping("/UpdateData")
	public String updateData(@RequestBody Student s) {
		sr.save(s);
		return "Data Is Updated...!!";
		
	}
	
	
	@RequestMapping("/SAMEAGE")
	public List<Student> findAgeEqual(@RequestParam int age){
		
		return sr.findByAgeEquals(age);
	
	}
	@RequestMapping("/AgeBetween")
	public List<Student> findAgeBetween(@RequestParam int age1 ,int age2){
		
		return sr.findByAgeBetween(age1,age2);
	
	}
	 
	 @RequestMapping("/AgeGreaterThanEqual")
		public List<Student> findAgeGreaterThanEquals(@RequestParam int age){
			return sr.findByAgeGreaterThanEqual(age);
		
		}
	 
	 @RequestMapping("/AgeLessThanEqual")
		public List<Student> findAgeLessThanEquals(@RequestParam int age){
			return sr.findByAgeLessThanEqual(age);
		
		}
}
