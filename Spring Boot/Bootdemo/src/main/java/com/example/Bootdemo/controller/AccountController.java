package com.example.Bootdemo.controller;
import java.util.*;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Bootdemo.dto.Account;
import com.example.Bootdemo.dto.Product;
import com.example.Bootdemo.dto.Student;
import com.example.Bootdemo.repository.AccountRepository;

@RestController
public class AccountController{
	@Autowired
	AccountRepository ar;
 
		
		
		@RequestMapping("/SAVE")
		public String saveAccount(@RequestBody Account a) {
			ar.save(a);
			return "Data Saved  ...!!";
		}
		
		@RequestMapping("/LogIn")
		public String logInValidation(@RequestBody Account a) {
			
			Account ac=ar.findByEmailAndPassword( a.getEmail(), a.getPassword());
			if(ac!=null) {
				return "Log In Sucess...!!";
			}
			else {
				return "Invalid Credentials..!!";
			}
			
		}
		
		
		
}
