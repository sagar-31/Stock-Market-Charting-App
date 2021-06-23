package com.example.StockMarketChartingApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.StockMarketChartingApp.Repository.sectorRepo;
import com.example.StockMarketChartingApp.Service.SectorServices;
import com.example.StockMarketChartingApp.model.Company;
import com.example.StockMarketChartingApp.model.Sector;
import com.example.StockMarketChartingApp.model.StockExchange;
@CrossOrigin("*")
@RestController
public class SectorController {
	@Autowired
	sectorRepo repo;
	
	@GetMapping("/getCompaniesFromSectors/{id}")
	public List<Company> getCompanyList(@PathVariable int id){
		Sector sector = repo.findById(id).orElse(null);
		return sector.getCompanies();
	}
	@GetMapping("/getSectors")
	public List<Sector> getSectors(){
		return repo.findAll();
	}
	@PostMapping("/addSector")
	public Sector addSector(@RequestBody Sector s) {
		return repo.save(s);
	}

}
