package com.example.StockMarketChartingApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StockMarketChartingApp.model.Sector;

@Repository
public interface sectorRepo extends JpaRepository<Sector, Integer> {

}
