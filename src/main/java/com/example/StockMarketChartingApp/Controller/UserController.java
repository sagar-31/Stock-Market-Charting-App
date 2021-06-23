package com.example.StockMarketChartingApp.Controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.StockMarketChartingApp.Repository.UserRepo;
import com.example.StockMarketChartingApp.Service.UserService;
import com.example.StockMarketChartingApp.model.User;

@CrossOrigin("*")
@RestController
@RequestMapping("/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepo repo;
	
	
	@GetMapping("/users")
	public List<User> allUsers()
	{
		return repo.findAll();
	}
	@GetMapping("/userByEmail/{email}")
	public User userByName(@PathVariable String email)
	{
		return repo.findByEmail(email);
	}
	@PostMapping("/signup")
	public String createUser(@RequestBody User user)
	{
		repo.save(user);
		userService.signup(user);
		return "User created!..Please confirm account to login";	
	}
	
	@GetMapping("/users/{id}/confirm")
	public String confirmUser(@PathVariable int id)
	{
		userService.confirmEmail(id);
		return "User confirmed";
	}
	
	@PostMapping("/users/{id}/change")
	public String changePasswordMailSend(@PathVariable int id, @RequestBody User u)
	{
		userService.change(u);
		return "Changes Made!";
	}
	
	@PostMapping("/login")
	public User loginUser(@RequestBody Map<String,Object> credentials)
	{
		String email = (String) credentials.get("username");
		String password = (String) credentials.get("password");
		User u = userService.loginUser(email, password);
		return u;
	}
	
	
	//signup new user
	//send email verification
	//verify user using password
	//update profile and password
	
	

}
