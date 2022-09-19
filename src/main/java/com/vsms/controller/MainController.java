package com.vsms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	
	@RequestMapping("/index")
	public String login()
	{
		return "index";
	}
	
	@RequestMapping("/header")
	public String header()
	{
		return "header";
	}
	
	@RequestMapping("/nav")
	public String nav()
	{
		return "sideNav";
	}
	
	@GetMapping("/login")
	public String log()
	{
		return "login";
	}
	
	@RequestMapping("/404")
	public String error404()
	{
		return "error-404";
	}
	
	@RequestMapping("/400")
	public String error400()
	{
		return "error-400";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard()
	{
		return "dashboard";
	}
	
	@RequestMapping("/addCustomer")
	public String addCustomer()
	{
		return "addCustomer";
	}
	
	@RequestMapping("/manageCustomer")
	public String manageCustomer()
	{
		return "manageCustomer";
	}
	
	@RequestMapping("/addVehicle")
	public String addVehicle()
	{
		return "addVehicle";
	}
	
	@RequestMapping("/manageVehicle")
	public String manageVehicle()
	{
		return "manageVehicle";
	}
	
	
	@RequestMapping("/resetpass")
	public String resetpass()
	{
		return "resetpass";
	}
	
	@RequestMapping("/registration")
	public String registration()
	{
		return "registration";
	}
	


}
