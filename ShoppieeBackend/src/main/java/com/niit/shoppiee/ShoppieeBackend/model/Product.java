package com.niit.shoppiee.ShoppieeBackend.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProductDetails")
public class Product  implements Serializable {
	
	@Id
	@Column(name="product_id")
	    private String id;
	@Column(name="product_brand")
	private String brand;
	@Column(name="product_name")
	    private String name ;
	@Column(name="product_description")
	    private String description;
	@Column(name="product_price")
	    private String price;
	@Column(name="product_quantity")
	    private String quantity;
	@Column(name="product_category")
	    private String category;
	@Column(name="product_supplier")
	    private String supplier;

	    
	    public Product(String productId, String brand, String productName, String description, String price, String quantity,
			String category, String supplier) {
		super();
		this.id = productId;
		this.brand = brand;
		this.name = productName;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
		this.supplier = supplier;
	}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
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
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	  /*//Getter and Setter methods for Product ID
		public void setProductId(String productId)
		{
			this.id=productId;
		}
	    public String getProductId()
	    {
	    	return id;
	    }
	    
	    //Getter and Setter methods for Product Brand
	    public void setProductBrand(String brand)
		{
			this.brand=brand;
		}
	    public String getProductBrand()
	    {
	    	return brand;
	    }
	    
	    //Getter and Setter methods for Product Name
	    public void setProductName(String productName)
		{
			this.name=productName;
		}
	    
	    public String getProductName()
	    {
	    	return name;
	    }
	    
	    //Getter and Setter methods for Product Description
	    public void setProductDescription(String description)
		{
			this.description=description;
		}
	    public String getProductDescription()
	    {
	    	return description;
	    }
	    
	    //Getter and Setter methods for Product Price
	    public void setProductPrice(String price)
		{
			this.price=price;
		}
	    public String getProductPrice()
	    {
	    	return price;
	    }
	    
	    //Getter and Setter methods for Product Quantity
	    public void setProdQuantity(String quantity)
		{
			this.quantity=quantity;
		}
	    public String getQuantity()
	    {
	    	return quantity;
	    }
	    
	    //Getter and Setter methods for Product Category
	    public void setProdCategory(String prodCategory)
		{
			this.category=category;
		}
	    public String getProdCategory()
	    {
	    	return category;
	    }
	    
	    //Getter and Setter methods for Product Supplier
	    public void setProdSupplier(String prodSupplier)
		{
			this.supplier=supplier;
		}
	    public String getProdSupplier()
	    {
	    	return supplier;
	    }*/
}
