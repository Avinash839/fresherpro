package com.example.demo;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeController {
 
	@RequestMapping("/")
    public String home(Map<String, Object> model) {
        model.put("message", "HowToDoInJava Reader !!");
        return "home";
	}
        @RequestMapping("/validate")
        public String welcome(HttpServletRequest req, HttpServletResponse res) {
	try {
		String name= req.getParameter("username");
		String pass= req.getParameter("password");
		String f="fresherpro";
		
		if(f.equals(name)&&f.equals(pass)) {
			
			return "welcome";
			
		}
		else {
			
			return "erro";
		}
	}catch(Exception e) {
		System.out.println("error");
	}
	return "";
	}
}
