package com.niit.shoppieebacknd.dao;

import java.util.List;

import com.niit.shoppieebacknd.model.Product;

public interface ProductDAO {
	
	public List<Product> getAllProduct();
	
	   public Product getProduct(String productid);
	   
	   public void updateProduct(Product product);
	   
	   public void deleteProduct(Product product);
	   
	   public void addProduct(Product product);
	   
}
