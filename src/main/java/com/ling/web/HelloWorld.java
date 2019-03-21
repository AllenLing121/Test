package com.ling.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ling.entity.User;
import com.ling.mapper.UserMapper;

/**
 * @Description: TODO
 * 
 * @author Lian
 * @Date Jan 30, 2019 4:24:14 PM 
 */
@RestController
public class HelloWorld {
	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/hello")
	public String hello(){
		return "Hello World!";
	}
	
	@GetMapping("/user/{id}")
	public User readUser(@PathVariable Long id,HttpServletRequest request){
		User u = this.userMapper.getUser(id);
		System.out.println("id = [" + id + "], request = [" + request + "]");
		return u;
	}
}
