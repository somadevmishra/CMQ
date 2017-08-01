package com.cmq.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cmq.model.User;
import com.cmq.service.UserService;
import com.cmq.validationForms.LoginForm;


@Controller
@ControllerAdvice
public class LoginController {

	@Autowired
	private UserService uesrService; 	
	
	@RequestMapping(value="/gotologin",method=RequestMethod.POST )
	public String gotoLoginPage(){
		return "login";
	}

	@RequestMapping(value="/login",method=RequestMethod.POST )
	public String loginUser(@ModelAttribute("loginForm") @Valid LoginForm loginForm, BindingResult bindingResult, ModelMap map){
		
		if(bindingResult.hasErrors()){
			map.addAttribute("invalid", "validation failed");
			return "login";
		}
		
		User user=uesrService.getUserByEmailId(loginForm.getUsername());
		if(user.getId() != null && user.getId() > 0 && user.getPassword().equals(loginForm.getPassword())){
			String welcomeMessage="Welcome123 "+user.getNickName()+". You have successfully logged-In";
			System.out.println(welcomeMessage);
			map.addAttribute("welcome_message", welcomeMessage);
			map.addAttribute("user", user);
			return "welcome";
		}
		else
			return "error";
	}
	
	@ModelAttribute("loginForm")
	public LoginForm getloginForm(Model model){
		LoginForm loginForm= new LoginForm();
		model.addAttribute("loginForm", loginForm);
		return loginForm;
	}
}
