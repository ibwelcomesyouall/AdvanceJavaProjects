package org.indranil.learning.service;

import java.util.HashMap;

import org.indranil.learning.dto.User;

public class LoginService {
	
	HashMap<String,String> users = new HashMap<String,String>();
	
	public LoginService() {
		users.put("johndoe","John Doe");
		users.put("janedoe","Jane Doe");
		users.put("jguru","Java Guru");
	}
	
	public boolean authenticate(String userId, String password) {
		
		if(password == null || password.trim() == "") 
			return false;
		else
			return true;
	}
	
	public User getUserDetails(String userId) {
		User user = new User();
		user.setUsername(users.get(userId));
		user.setUserId(userId);
		return user;
	}

}
