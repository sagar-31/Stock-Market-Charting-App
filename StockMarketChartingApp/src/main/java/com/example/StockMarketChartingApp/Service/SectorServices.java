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
	
	public Sector saveSector(Sector sector) {
		return repo.save(sector);
	}	
	
	public List<Sector> getSectors() {
		return repo.findAll();
	}
	
	public Sector findById(int id) {
		return repo.findById(id).orElse(null);
	}

}
