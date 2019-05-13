package com.videostreaming.adminservice.proxy;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.videostreaming.adminservice.entity.User;

@FeignClient(name="user-service")
@RibbonClient(name="user-service")
public interface FindAllUsersProxy{

	@GetMapping("/allUsers")
	public List<User> gettingAllUsers();
	
	
	
}
