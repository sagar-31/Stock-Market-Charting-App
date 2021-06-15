package com.example.StockMarketChartingApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StockMarketChartingApp.Repository.StockPriceRepo;
import com.example.StockMarketChartingApp.model.StockPrice;

@Service
public class StockPriceService {
	@Autowired
	StockPriceRepo repository;

	public StockPrice saveStockPrice(StockPrice stockPrice) {
		return repository.save(stockPrice);
	}
	
}
