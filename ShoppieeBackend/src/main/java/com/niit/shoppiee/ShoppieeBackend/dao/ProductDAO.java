package com.niit.shoppiee.ShoppieeBackend.dao;

import java.util.List;

import com.niit.shoppiee.ShoppieeBackend.model.Product;


public interface ProductDAO {

	 public List<Product> getAllProductDetails();
	 
	 Product getProductDetail(String productid);
	 
	 void updateProductDetails (Product obj);
	 
	 void addProduct(Product obj);
              
}

