/*package com.niit.shoppiee.ShoppieeBackend.service;


import java.util.List;

import org.hibernate.SessionFactory;

import com.niit.daoimpl.ProductDAOImpl;
import com.niit.model.ProductModel;

//Created Service class for Product
public class ProductService
{
	private static ProductDAOImpl productdaoimpl;
	
	//Created Service class for Product
	public ProductService() {
    	productdaoimpl = new ProductDAOImpl();
    }
	
	public ProductService(SessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
	}

	//Created method for adding a Product
	public void addProduct(Product entity) {
    	productdaoimpl.openCurrentSessionwithTransaction();
    	productdaoimpl.addProduct(entity);;
    	productdaoimpl.closeCurrentSessionwithTransaction();
    }
	
	//Created method for updating Product 
    public void updateProduct(Product entity) {
    	productdaoimpl.openCurrentSessionwithTransaction();
    	productdaoimpl.updateProductDetails(entity);
    	productdaoimpl.closeCurrentSessionwithTransaction();
   }
    
   //Created method for reading a single Product
    public Product getProduct(String id) {
    	productdaoimpl.openCurrentSession();
    	Product book = productdaoimpl.getProductDetail(id);
        productdaoimpl.closeCurrentSession();
        return book;
    }
    
    //Created method for reading a multiple Products
    public List<Product> findAll() {
   	productdaoimpl.openCurrentSession();
       List<Product> books = productdaoimpl.getAllProductDetails();
       productdaoimpl.closeCurrentSession();
       return books;
   }
    
    //Created method for reading a ProductDAOImpl object
    public ProductDAOImpl productdaoimpl() {
        return productdaoimpl;
    }

    public void delete(String id) {

    	productdaoimpl.openCurrentSessionwithTransaction();

    	Product book = productDAOImpl.getProductDetail(id;

        productdaoimpl.delete(book);

        productdaoimpl.closeCurrentSessionwithTransaction();

    }

   

     public void deleteAll() {

    	productdaoimpl.openCurrentSessionwithTransaction();

    	productdaoimpl.deleteAll();

    	productdaoimpl.closeCurrentSessionwithTransaction();

    }
     
}
*/