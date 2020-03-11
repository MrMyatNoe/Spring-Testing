package com.tmn.springtesting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

	/*
	 * @Autowired UserService userService;
	 */
	
	
	/*
	 * @GetMapping("/login") public String hello(Model model) {
	 * System.out.println("login"); return "login"; }
	 * 
	 * @PostMapping("/login") public String login(Model model, @Valid String name,
	 * String password) {
	 * 
	 * return "redirect:mainscreen"; }
	 */
	 
	@PostMapping("/register")
	public String registerUser(Model model) {
		/*
		 * if(error.hasErrors()) { System.out.println("error register"); return
		 * "register"; } else { this.userService.saveUser(user); return
		 * "redirect:login"; }
		 */
		return "register";
	}
	
	@GetMapping("/register")
	public String register(Model model) {
//		System.out.println("Getmapping");
//		UserDto user = new UserDto();
//		model.addAttribute("user",user);
		return "register";
	}
	
	/*
	 * @GetMapping("/mainscreen") public String mainScreen(Model model) { return
	 * "mainscreen"; }
	 */
}
