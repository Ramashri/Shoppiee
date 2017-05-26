package com.niit.shoppiee.ShoppieeBackend.daoimpl;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.niit.shoppiee.ShoppieeBackend.dao.ProductDAO;
import com.niit.shoppiee.ShoppieeBackend.model.Product;


public class ProductDAOImpl implements ProductDAO{

	private Session currentSession;
	private Transaction currentTransaction;
	
	
	public ProductDAOImpl() {
		
	}
	
	public Session openCurrentSession() {
	    currentSession = getSessionFactory().openSession();
	    return currentSession;
    }
	
	public Session openCurrentSessionwithTransaction() {
			currentSession = getSessionFactory().openSession();
			currentTransaction = currentSession.beginTransaction();
			return currentSession;
	}

    public void closeCurrentSession() {
    		currentSession.close();
    }
    
     public void closeCurrentSessionwithTransaction() {
         	currentTransaction.commit();
         	currentSession.close();
     }
     
	 private static SessionFactory getSessionFactory() {
		     
             Configuration configuration = new Configuration().configure();
             StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
             SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
             return sessionFactory;
     }
	
	    public Session getCurrentSession() {
		 	return currentSession;
     }

    public void setCurrentSession(Session currentSession) {
        	this.currentSession = currentSession;
     }

    public Transaction getCurrentTransaction() {
             return currentTransaction;
     }

     public void setCurrentTransaction(Transaction currentTransaction) {
    	 	this.currentTransaction = currentTransaction;
    }

	//Getting Product details from Model
	public List<Product> getAllProductDetails()
	{
		List<Product> products = (List<Product>) getCurrentSession().createQuery("from ProductDetails").list();

        return products;
	}
	
	public Product getProductDetail(String id)
	{
		Product product = (Product) getCurrentSession().get(Product.class, id);

        return product;
	}
	
	public void updateProductDetails(Product obj)
	{
		getCurrentSession().update(obj);
	
	}
	public void addProduct(Product obj)
	{
		getCurrentSession().save(obj);
	}

 
}
