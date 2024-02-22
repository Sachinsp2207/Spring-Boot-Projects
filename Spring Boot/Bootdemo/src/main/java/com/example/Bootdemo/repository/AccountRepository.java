package com.example.Bootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Bootdemo.dto.Account;
import com.example.Bootdemo.dto.Student;

public interface AccountRepository extends JpaRepository<Account,Integer> {
			
	Account findByEmailAndPassword(String email,String password);
}

