package com.Application.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Application.entity.User;
import com.Application.service.UserService;

import dto.scoreRequest;



@Controller 
public class UserController {
	
	@Autowired
	private UserService service;
	
	
	@GetMapping("/")
	
	public String Mainpage() {
		return "index";
	}
	
	 @GetMapping("/register")
	    public String Register() {
	        
	        return "register";
	    }
	
   @GetMapping("/login")
	
	public String Login() {
		return "index";
	}

   @GetMapping("/logout")
   public String Logout() {
	   return "index";
   }

// Handle form submission
   @PostMapping("/register")
	public String registeruser(@ModelAttribute User user, RedirectAttributes redirectAttributes) {
		service.SavingData(user);
		redirectAttributes.addFlashAttribute("successMessage", "Registration successful!");
       return "redirect:/register";
}
   
   //Login 
   
   @PostMapping("/login")
   
   public String Loginuser(@RequestParam String email, @RequestParam String password, Model model ) {
	   
	   if(service.UserLogin(email, password)) {
		   return "welcom.html";
	   }else{
		  // Add error message to the model
	        model.addAttribute("error", "Invalid email or password");
	        return "index"; // Return to the login page
	    
             }
	   
   
        }
   
   @GetMapping("/quiz")
   
   public String Quiz() {
	   return "quiz";
   }
   
   @PostMapping("/updateScore")
   public String updateScore(@RequestBody scoreRequest scoreRequest) {
       service.updateUserScore(scoreRequest.getEmail(), scoreRequest.getScore());
       return "end";
   }
   
   

  
   
	
	}
