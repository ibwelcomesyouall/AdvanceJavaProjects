package com.indranil.monthly_grossary_planner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.indranil.monthly_grossary_planner.entity.User;
import com.indranil.monthly_grossary_planner.service.UserService;

@Controller
public class MonthlyGrossaryPlannerController {

	// need to inject our user service
	@Autowired
	private UserService userService;
		
	@GetMapping("/")
	public String showHome() {
		
		return "home";
	}
	
	// add request mapping for /admin
	
	@GetMapping("/admin/view_modify_users")
	public String showAdmin_ViewModifyUsers(Model theModel) {
		
		// get users from the service
		List<User> theUsers = userService.getUsers();
				
		// add the customers to the model
		theModel.addAttribute("users",theUsers);
		
		return "admin-ViewModifyUsers";
	}
	
	@GetMapping("/admin/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		User theUser = new User();
		theModel.addAttribute("user", theUser);
		
		return "user-form";
	}
	
	@PostMapping("/admin/saveUser")
	public String saveUser(@ModelAttribute("user")User theUser) {
		
		// save the user using our service
		userService.saveUser(theUser);
		return "redirect:/admin/view_modify_users";
	}
	
	@GetMapping("/admin/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("username")int theId, Model theModel) {
		
		// get the user form our service
		User theUser = userService.saveUser(theId);
		
		// set user as a model attribute to pre-populate the form
		theModel.addAttribute("user", theUser);
		
		// send over to our form
		return "user-form";
	}

	

	@GetMapping("/admin/update_item_list")
	public String showAdmin_UpdateItemList() {
		
		return "admin-UpdateItemList";
	}
	
	// add request mapping for /user
	
		@GetMapping("/user/dashboard")
		public String showUser_Dashboard() {
			
			return "user-Dashboard";
		}
		
		@GetMapping("/user/generate_shopping_list")
		public String showUser_GenerateShoppingList() {
			
			return "user-GenerateShoppingList";
		}
		
		@GetMapping("/user/update_shopping_details")
		public String showUser_UpdateShoppingDetails() {
			
			return "user-UpdateShoppingDetails";
		}
		
		// add request mapping for /visitor
		
		@GetMapping("/visitor")
		public String showVisitor_Enhancement() {
			
			return "visitor-Enhancement";
		}
}