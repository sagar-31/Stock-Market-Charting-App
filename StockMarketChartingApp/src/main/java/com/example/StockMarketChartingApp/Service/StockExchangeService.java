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
	
	public StockExchange saveStockExchange (StockExchange stockExchange) {
		return repo.save(stockExchange);
	}
	
	public StockExchange getByStockExchangeName (String stockExchangeName) {
		return repo.findByStockExchangeName(stockExchangeName);
	}
	
	public List<StockExchange> getAllStockExchanges () {
		return repo.findAll();
	}
	
	public StockExchange findById(int id) {
		return repo.findById(id).orElse(null);
	}

}
