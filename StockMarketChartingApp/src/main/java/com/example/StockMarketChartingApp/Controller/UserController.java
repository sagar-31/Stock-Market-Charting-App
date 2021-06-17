package com.example.StockMarketChartingApp.Controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import com.example.StockMarketChartingApp.model.User;


@RestController
@RequestMapping("/")
public class UserController {
	
	@Autowired
	UserRepo repo;
	
	
	
//	@PostMapping("/user/signup")
//	public String createUser(@RequestBody User u)
//	{
//		repo.save(u);
//		String mailbody = "<h1><a href =\"http://127.0.0.1:8080/api/confirmuser/"+u.getId()+"/\"> Click to confirm </a></h1>";
//		sendemail(u.getEmail(), mailbody, "Account confirmation Email");
//		return "User created!..Please confirm account to login";	
//	}
//	
//	@GetMapping("/confirmuser/{id}")
//	public String confirmUser(@PathVariable int id)
//	{
//		userService.confirmEmail(id);
//		return "User confirmed";
//	}
//	
//	@PostMapping("/user/{id}/changepass")
//	public String changePasswordMailSend(@PathVariable int id, @RequestBody String email)
//	{
//		userService.changePassword(id, email);
//		return "A link to reset password has been sent to your registered email";
//	}
//	
//	@GetMapping("/user/{id}/resetpass") //pending
//	public String getResetPasswordForm(@PathVariable int id)
//	{
//		return "Form";
//	}
//	
//	@PostMapping("/user/{id}/resetpass")
//		public String resetPassword(@PathVariable int id, @RequestParam("newpass") String newPassword, @RequestParam("confirmnewpass") String confirmNewPassword)
//		{
//			userService.resetPassword(id, newPassword, confirmNewPassword);
//			return "Password changed successfully";
//		}
//	
//	@PostMapping("/user/login")
//	public User loginUser(@RequestBody Map<String,Object> credentials)
//	{
//		String email = (String) credentials.get("username");
//		String password = (String) credentials.get("password");
//		User u = userService.loginUser(email, password);
//		return u;
//	}
//	
	@GetMapping("/users/all")
	public List<User> findAllUsers() {
		return repo.findAll();
	}
	//signup new user
	//send email verification
	//verify user using password
	//update profile and password
	
	

}
