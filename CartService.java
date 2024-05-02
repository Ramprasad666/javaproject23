package com.jsp.Ekart_application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.Ekart_application.entity.Cart;
import com.jsp.Ekart_application.entity.Product;
import com.jsp.Ekart_application.repository.CartRepository;
import com.jsp.Ekart_application.repository.ProductRepository;

@Service
public class CartService {
	
	@Autowired
	
	ProductRepository pr;
	public List<Product> getAllProducts(){
		return pr.findAll();
		
	}

	public  void save (Product p) {
		pr.save(p);
	}
	
	public void deleteById(int id) {
		pr.deleteById(id);
	}
	
	
}
