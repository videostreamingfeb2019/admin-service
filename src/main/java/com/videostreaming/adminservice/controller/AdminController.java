package com.videostreaming.adminservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.videostreaming.adminservice.entity.User;
import com.videostreaming.adminservice.proxy.FindAllUsersProxy;

@RestController
public class AdminController {
	
	@Autowired
	private FindAllUsersProxy allUsersProxy;
	
	@GetMapping("/allUsersDetails")
	public List<User> allUsers(){
		List<User> user=allUsersProxy.gettingAllUsers();
		return user;
		}
	
}
