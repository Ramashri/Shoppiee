package com.niit.shoppieebacknd.model;

import java.util.List;

import javax.servlet.http.Part;

public class Product {
	
	private int productId;
	private String brand;
	private String productName;
	private String description;
	private String price;
	private String quantity;
	private String category;
	private String supplier;
	//private List<Part> image;
	
	
	public Product(int productId, String brand, String productName, String description, String price, String quantity,
			String category, String supplier) {
		super();
		this.productId = productId;
		this.brand = brand;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
		this.supplier = supplier;
		//this.image = image;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	/*public List<Part> getImage() {
		return image;
	}
	public void setImage(List<Part> image) {
		this.image = image;
	}*/
	

}
