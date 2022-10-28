package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.repository.UserRepository;
import com.example.to.User;

@Controller
public class HomeController {
	
	@Autowired
	UserRepository userRepository;

	@RequestMapping("/")
	public ModelAndView home() {
		
		ModelAndView modelAndView = new ModelAndView("index");
		
		return modelAndView;
	}
	
	@RequestMapping("/login")
	public ModelAndView login(String username, String pwd) throws Exception {
		
		System.out.println("inside login( )"+username+", "+pwd);
		
		User user = userRepository.findByUsernameAndPassword(username, pwd);
		
		if(user != null) {
			System.out.println("inside if...");
			ModelAndView modelAndView = new ModelAndView("welcomePage");
			modelAndView.addObject("userData", user);
			return modelAndView;
		}
		else {
			System.out.println("inside else...");
			ModelAndView modelAndView = new ModelAndView("index");
			return modelAndView;
		}
		
//		Optional<User> optional = userRepository.findById(username);
//		
//		User user = optional.get();
//		
//		String fetchedPassword = user.getPassword();
//		
//		if(fetchedPassword.equals(pwd)) {
//			ModelAndView modelAndView = new ModelAndView("welcomePage");
//			modelAndView.addObject("userData", user);
//			return modelAndView;
//		}
//		else {
//			ModelAndView modelAndView = new ModelAndView("index");
//			return modelAndView;
//		}
		
//		if(user != null) {
//			ModelAndView modelAndView = new ModelAndView("welcomePage");
//			modelAndView.addObject("userData", user);
//			return modelAndView;
//		}
//		else {
//			ModelAndView modelAndView = new ModelAndView("index");
//			return modelAndView;
//		}
		
		
	}
	
	@RequestMapping("/registrationPage")
	public ModelAndView registrationPage() {
		System.out.println("inside registrationPage");
		ModelAndView modelAndView = new ModelAndView("registrationPage");
		
		return modelAndView;
	}
	
	@RequestMapping("/register")
	public ModelAndView register(String username, String password, String firstName, String lastName, String email) {
		System.out.println("inside register() "+username+", "+password);
		ModelAndView modelAndView = new ModelAndView("index");
		
		User user = new User(username, password, firstName, lastName, email);
		
		userRepository.save(user);
		
		
		return modelAndView;
	}
	
	
}







//UserRepository userRepository = new UserRepository();
//
//User user = userRepository.validateUser(username, pwd);