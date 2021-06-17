package com.example.StockMarketChartingApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StockMarketChartingApp.Repository.UserRepo;


@Service

public class UserService {
	
	@Autowired
	UserRepo userRepository;
	
	
}
