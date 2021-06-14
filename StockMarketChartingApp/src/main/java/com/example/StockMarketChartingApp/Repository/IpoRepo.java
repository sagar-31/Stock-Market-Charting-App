package com.example.StockMarketChartingApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StockMarketChartingApp.model.IPO;

public interface IpoRepo extends JpaRepository<IPO, Integer> {

}
