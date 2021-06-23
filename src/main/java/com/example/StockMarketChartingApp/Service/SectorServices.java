package com.example.StockMarketChartingApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StockMarketChartingApp.Repository.sectorRepo;
import com.example.StockMarketChartingApp.model.Sector;


@Service
public class SectorServices {
	
	@Autowired
	sectorRepo repo;
	

}
