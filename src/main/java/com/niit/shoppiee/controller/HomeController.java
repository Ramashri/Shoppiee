package com.niit.shoppiee.controller;

    
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.servlet.ModelAndView;

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

}
