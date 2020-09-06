package com.menu.system.cart.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	
	@GetMapping("/")
	public String getIp() throws UnknownHostException {
		return InetAddress.getLocalHost().getHostAddress();
	}
}
