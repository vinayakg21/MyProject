package com.cg.rms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	
	@RequestMapping("Login")
	public String getLoginPage(){
		return "loginval"; 
	}
	
	@RequestMapping("userLogin")
	public String validateUser(Model model ,
			  @RequestParam("username") String uname,
			  @RequestParam("password")String pass){
		if(uname.equals("candidate") && pass.equals("candidate"))
		{
		model.addAttribute("successMsg",
				"Welcome to candidate Page");
		model.addAttribute("username", uname);
		return "candidateMenu";
		}
		else if(uname.equals("admin") && pass.equals("admin"))
				{
			model.addAttribute("successMsg",
					"Welcome to admin Page");
			model.addAttribute("username", uname);
			return "adminMenu";
			}
		
		else if(uname.equals("company") && pass.equals("company"))
		{
	model.addAttribute("successMsg",
			"Welcome to company Page");
	model.addAttribute("username", uname);
	return "comanyMenu";
	}
				
				{
			model.addAttribute
			("errorMsg", "Invalid Username/Password");
			return "Error";
	
	}
	
	

}
}
