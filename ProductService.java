package com.jsp.Ekart_application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.Ekart_application.entity.Product;
import com.jsp.Ekart_application.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	 private ProductRepository productrepository;
	
	
	public  void save (Product p) {
		productrepository.save(p);
	}
	
	public List<Product> getAllproducts(){
		 return productrepository.findAll();
	}
	
	public Product getProductById(int id) {
		Optional <Product> optional =productrepository.findById(id);
//		if(optional.isPresent()) {
//		
//			Product p=optional.get();
//			return p;
//	}
		return productrepository.findById(id).get();
	}
	
	public void deleteById (int id) {
		productrepository.deleteById(id);
	}
	
}
