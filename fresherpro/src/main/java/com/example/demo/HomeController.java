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
		int flag=0;
		if(f.equals(name)&&f.equals(pass)) {
			System.out.println(name);
			System.out.println(pass);
			System.out.println("correct");
			flag=1;
			return "welcome";
			
		}
		else {
			flag=2;
			System.out.println(flag);
			System.out.println(name);
			System.out.println(pass);
			System.out.println("wrong");
			return "erro";
		}
	}catch(Exception e) {
		System.out.println("error");
	}
	return "";
	}
}
