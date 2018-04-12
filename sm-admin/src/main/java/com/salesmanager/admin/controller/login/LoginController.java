package com.salesmanager.admin.controller.login;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	
	@Inject
	private AuthenticationManager authenticationManager;
	
	@RequestMapping("/login")
	public String display(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return "login/login";
	}
	
	@RequestMapping(value="/login.json", method = RequestMethod.POST)
	public ResponseEntity<String> login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//return "login/login";
		//retrun RESTEntity
		
		//authenticationManager.authenticate(auth)
		
		return null;
	}

}
