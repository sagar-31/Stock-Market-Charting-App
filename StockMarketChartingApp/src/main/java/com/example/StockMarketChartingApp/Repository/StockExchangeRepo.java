package com.example.StockMarketChartingApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StockMarketChartingApp.model.StockExchange;

@Repository
public interface StockExchangeRepo extends JpaRepository<StockExchange, Integer>{
	StockExchange findByStockExchangeName(String stockExchangeName);

}
