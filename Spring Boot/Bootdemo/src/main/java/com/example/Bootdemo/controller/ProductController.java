package com.example.Bootdemo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Bootdemo.dto.Product;
import com.example.Bootdemo.dto.Student;
import com.example.Bootdemo.repository.ProductRepository;
import java.util.*;
@RestController
public class ProductController {

	ProductRepository pr;
	ProductController(ProductRepository pr){
		this.pr=pr;
	}
	@PostMapping("/SaveProduct")
	public String save(@RequestBody Product p) {
	pr.save(p);
	return "Data Save Sucessfully";
	}
	@RequestMapping("/")
	public Optional<Product> findById(@RequestParam int id) {
		Optional<Product>p=pr.findById(id);
		return p;
	}
	
	@RequestMapping("/FindByCate")
	public List<Product> findByCat(@RequestParam String category) {
		List<Product>p=pr.findByCategory(category);
		return p;
	}
	
	@RequestMapping("/FindByPriceBetProd")
	public List<Product> findByCat(@RequestParam int price1,int price2) {
		List<Product>p=pr.findBypriceBetween(price1,price2);
		return p;
	}
	
	@RequestMapping("/FindProdPriceGreaterThan")
	public List<Product> findByPricegreater(@RequestParam int price) {
		List<Product>p=pr.findByPriceGreaterThan(price);
		return p;
	}
	
	@RequestMapping("/FindProdPriceGreaterThanEquals")
	public List<Product> findByPriceGreaterThanEq(@RequestParam int price) {
		List<Product>p=pr.findByPriceGreaterThanEqual(price);
		return p;
	}
		
	}
	

