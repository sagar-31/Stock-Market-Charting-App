package com.example.StockMarketChartingApp.Service;

import java.util.Optional;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;
import com.example.StockMarketChartingApp.Repository.UserRepo;
import com.example.StockMarketChartingApp.model.User;


@Service
public class UserService {

	@Autowired
	UserRepo userRepository;
	
	
	JavaMailSenderImpl javamailsender=new JavaMailSenderImpl();
	
	
	public User signup(User user)
	{
//		User u = new User(user.getUserName(), user.getPassword(),user.getUserType(), user.getEmail(), 
//				user.getMobileNumber(),user.isConfirmed());
		userRepository.save(user);
//		String mailbody = "<h1><a href =\"http://localhost:8080/users/"+u.getId()+"/confirm\"> Click to confirm </a></h1>";
//		sendemail(u.getEmail(), mailbody, "Account confirmation Email");
		return user;
	}
	
	public void sendemail(String toEmail,String body, String subject)
	{
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(toEmail);
		message.setFrom("sagar.saxena.min17@itbhu.ac.in");
		message.setSubject(subject);
		message.setText(body);
		javamailsender.send(message);
	}
       
	public void confirmEmail(int id)
	{
		User user = userRepository.findById(id).orElse(null);
		user.setConfirmed("yes");
		userRepository.save(user);
	}
	
	public void change(User u)
	{
		userRepository.save(u);
	}
	
	public User loginUser(String email, String password)
	{
		User user = userRepository.findByEmail(email);
		if(user==null)
			return null;
		else
		{
			if(password.equals(user.getPassword()))
				return user;
		}
		return user;
	}
}