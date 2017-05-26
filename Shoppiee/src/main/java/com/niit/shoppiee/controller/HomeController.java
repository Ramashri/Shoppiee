package com.niit.shoppiee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppiee.ShoppieeBackend.dao.ProductDAO ;
import com.niit.shoppiee.ShoppieeBackend.daoimpl.ProductDAOImpl;
import com.niit.shoppiee.ShoppieeBackend.model.Product;

	@Controller
	public class HomeController {
		
		@RequestMapping("/")
		public ModelAndView index() {

			ModelAndView mv = new ModelAndView("index");
			return mv;
		}

		@RequestMapping("/signup")
		public ModelAndView signup() {

			ModelAndView mv = new ModelAndView("signup");
			return mv;
		}
		
		@RequestMapping("/login")
		public ModelAndView login() {

			ModelAndView mv = new ModelAndView("login");
			return mv;
	}
		@RequestMapping("/productdesc")
		public ModelAndView description() {
			
			ModelAndView mv = new ModelAndView("productdesc");
			return mv;
		}
		@RequestMapping("/ProductList")
		public ModelAndView ProductList() {
			ProductDAO product=new ProductDAOImpl();
			/*product.addProduct(new Product("1", "ABCD", "XYZ", "Apla", "22", "4", "Pro", "Eng"));*/
			ModelAndView mv = new ModelAndView("ProductList");
			mv.addObject("products", product);
			return mv;
		}
	

}
 