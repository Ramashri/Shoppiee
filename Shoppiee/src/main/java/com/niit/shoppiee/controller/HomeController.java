package com.niit.shoppiee.controller;

    
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppieebacknd.dao.ProductDAO;
import com.niit.shoppieebacknd.daoimpl.ProductDAOImpl;
import com.niit.shoppieebacknd.model.Product;

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
			ProductDAO cart=new ProductDAOImpl();
			cart.addProduct(new Product(1, "ABCD", "XYZ", "Apla", "22", "4", "Pro", "Eng"));
			ModelAndView mv = new ModelAndView("ProductList");
			mv.addObject("products", cart);
			return mv;
		}
	

}
