package com.example.StockMarketChartingApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StockMarketChartingApp.model.IPO;

@Repository
public interface IpoRepo extends JpaRepository<IPO, Integer> {

}
