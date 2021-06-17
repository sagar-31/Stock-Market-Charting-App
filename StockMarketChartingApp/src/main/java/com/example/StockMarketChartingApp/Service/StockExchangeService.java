package com.example.StockMarketChartingApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StockMarketChartingApp.Repository.StockExchangeRepo;
import com.example.StockMarketChartingApp.model.StockExchange;



@Service
public class StockExchangeService {
	
	@Autowired
	StockExchangeRepo repo;
}
