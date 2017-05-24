package com.niit.shoppieebacknd.daoimpl;

import java.util.List;
import java.util.ArrayList;

import com.niit.shoppieebacknd.dao.ProductDAO;
import com.niit.shoppieebacknd.model.Product;

public class ProductDAOImpl implements ProductDAO {
	
	List<Product> products=null;

	   public ProductDAOImpl(){
	      products = new ArrayList<Product>();
	   }

	@Override
	public List<Product> getAllProduct() {
		
		// TODO Auto-generated method stub
		
		return products;
	}

	@Override
	public Product getProduct(String productid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProduct(Product product) {
		products.get(product.getProductId()).setPrice(product.getPrice());
		  
		
	}

	@Override
	public void deleteProduct(Product product) {
		products.remove(product.getProductId());
	}
	
	public Product findProduct(int productid){
		Product foundProduct=null;
		for(Product p:products)
		{
			if(p.getProductId()==productid){
				foundProduct=p;
			}
		}
		return foundProduct;
		
	}

	@Override
	public void addProduct(Product product) {
		
		// TODO Auto-generated method stub
		products.add(product);
	}

}
