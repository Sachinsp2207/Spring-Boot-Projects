package com.example.Bootdemo.repository;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Bootdemo.dto.Product;
import com.example.Bootdemo.dto.Student;

public interface ProductRepository extends JpaRepository<Product, Integer>  {
	
	List<Product> findByCategory(String category);
	
	List<Product> findBypriceBetween(int price1,int price2);

	List<Product> findByPriceGreaterThan(int price);
	
  List<Product> findByPriceGreaterThanEqual(int price);

}
