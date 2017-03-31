package com.purna.service;

import java.util.HashMap;

import com.purna.dto.User;

public class LoginService {

	HashMap<String, String> users = new HashMap<String, String>();

	public LoginService() {
		users.put("anrup", "purna magar");
		users.put("hari", "hari bahadur lamichhane");
		users.put("anita", "anit adhikari");

	}

	public boolean authentication(String uname, String pwd) {
		if (pwd != null && pwd.trim() != "") {
			return true;

		} else {
			return false;
		}
	}

	public User getUserDetails(String userId) {

		User user = new User();
		user.setFullname(users.get(userId));
		user.setUserId(userId);

		return user;

	}

}
