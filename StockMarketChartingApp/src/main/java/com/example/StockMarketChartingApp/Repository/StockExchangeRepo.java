package com.example.StockMarketChartingApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StockMarketChartingApp.model.StockExchange;

public interface StockExchangeRepo extends JpaRepository<StockExchange, Integer>{

}
