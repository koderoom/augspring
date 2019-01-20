package com.spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * URL - http://localhost:8080/demoapp/spring/k/1
 */
@RestController
@RequestMapping("/k")
public class HelloSpring {
	
	@GetMapping
	@RequestMapping("/1")
	public String sayHello() {
		System.out.println("MEMBER FUNCTION!!! WITH SPRING POWER!!!");
		return "Hello Spring!!!";
	}
	
	
	@GetMapping
	@RequestMapping("/2")
	public Boolean helloAgain() {
		return Boolean.TRUE;
	}
	
	@GetMapping
	@RequestMapping("/4")
	public Integer helloNumber() {
		return 100;
	}
	
	
	@GetMapping
	@RequestMapping("/3")
	public Map<String, String> helloAgain3() {
		Map<String, String> map = new HashMap<>();
		map.put("1", "CDAC");
		map.put("2", "KHARGHAR");
		map.put("3", "SPRING");
		
		return map;
	}
	
	@GetMapping
	@RequestMapping("/5")
	public List<String> helloAgain5() {
		List<String> list = new ArrayList<>();
		list.add("CDAC");
		list.add("KHARGHAR");
		
		return list;
	}
	
	
	
	@GetMapping
	@RequestMapping("/6")
	public Student hello6() {
		Student std = new Student();
		std.setId(1);
		std.setName("ABCD");
		
		return std;
	}
	
	
	@GetMapping
	@RequestMapping("/7")
	public List<Student> hello7() {
		
		List<Student> list = new ArrayList<>();
		
		Student std = new Student();
		std.setId(1);
		std.setName("ABCD");
		
		list.add(std);
		list.add(std);
		list.add(std);
		list.add(std);
		
		return list;
	}
	
	@GetMapping
	@RequestMapping("/login")
	public Boolean login(HttpServletRequest request) {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println(username);
		System.out.println(password);

		Boolean ret = false;
		if("java".equals(username)) {
			ret = true;
		}
		
		return ret;
	
	}
	
	
	
	@PostMapping("/9")
	public String helloPostMapping() {
		
		return "Hello Post";
	}
	
	
	@PostMapping("/10")
	public String helloPostMapping(Student std) {
		System.out.println(std);
		
		return "Hello Post";
	}
	
}
