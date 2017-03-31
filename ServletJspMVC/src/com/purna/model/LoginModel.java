package com.purna.model;

import java.util.HashMap;
import java.util.Map;

public class LoginModel {

	Map<String, String> map = new HashMap<String, String>();

	public LoginModel() {

		map.put("username", "purna bahadur pun magar");
		map.put("street", "4330 spectrum one");
		map.put("city", "san antonio");
		map.put("zip", "78230");

	}

	public boolean validate(String username, String password) {

		if (username.equals("purna") && !password.equals("")) {
			return true;

		} else {
			return false;
		}

	}

	public UserDetails getUserDetails() {

		UserDetails userDetails = new UserDetails();

		userDetails.setFullName(map.get("username"));
		userDetails.setStreet(map.get("street"));
		userDetails.setCity(map.get("city"));
		userDetails.setZip(map.get("zip"));

		return userDetails;

	}

}
