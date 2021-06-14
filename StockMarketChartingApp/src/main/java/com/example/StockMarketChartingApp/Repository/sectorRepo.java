package com.example.StockMarketChartingApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StockMarketChartingApp.model.Sector;

public interface sectorRepo extends JpaRepository<Sector, Integer> {

}
