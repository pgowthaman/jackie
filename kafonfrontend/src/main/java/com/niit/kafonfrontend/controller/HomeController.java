
package com.niit.kafonfrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("carousel", "true");
		return "index";
	}

	/*@RequestMapping("/validate")
	public String validate(@RequestParam("userid") String id, @RequestParam("pass") String pass1, Model model) {
		if (id.equals("gowthaman") && pass1.equals("google")) {
			model.addAttribute("successlogin", "successfully logged in");
			return "index";
		}else if (id.equals("admin") && pass1.equals("admin")) {
			model.addAttribute("successadmin12", "successfully logged in as admin");
			return "index";
		}else {
			model.addAttribute("failedlogin", "Failed to log in");
			return "index";
		}
	}*/

	/*@RequestMapping("/login")
	public String login(Model model) {
		model.addAttribute("log", "true");
		return "index";
	}

	/*@RequestMapping("/registerHere")
	public String registerHere(Model model) {
		model.addAttribute("reg", "true");
		return "index";
	}*/

	/*@RequestMapping("/register")
	public String register(@RequestParam("password") String password, @RequestParam("confirm") String confirm, Model model) {
		if (password.equals(confirm)) {
			model.addAttribute("successregister", "successfully registed");
			return "index";
		} else {
			model.addAttribute("failedregister", "password miss match");
			return "index";
		}
	}*/

	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("carousel", "true");
		return "index";
	}
    @RequestMapping("/about")
   	public String about(Model model) {
   		model.addAttribute("about", "true");
   		return "index";
    }
    @RequestMapping("/contact")
   	public String contact(Model model) {
   		model.addAttribute("contact", "true");
   		return "index";
    }
   
}
