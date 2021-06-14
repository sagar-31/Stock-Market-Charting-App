package com.example.StockMarketChartingApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StockMarketChartingApp.model.StockPrice;

public interface StockPriceRepo extends JpaRepository<StockPrice, Integer> {
	

}
