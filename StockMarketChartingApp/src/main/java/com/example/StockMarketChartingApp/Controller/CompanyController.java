package com.example.StockMarketChartingApp.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.StockMarketChartingApp.Service.CompanyService;
import com.example.StockMarketChartingApp.model.Company;
import com.example.StockMarketChartingApp.model.IPO;


@RestController
public class CompanyController {
	@Autowired
	CompanyService service;
	
	@PutMapping("/updateCompany")
	public Company updateCompany(@RequestBody Company company) {
		return service.updateCompany(company);
	}
	
	@GetMapping("/getCompany/{id}")
	public Company getCompany(@PathVariable int id) {
		return service.findById(id);
	}
	
	@GetMapping("/getIpoFromCompany/{id}")
	public IPO getIpoFromCompany(@PathVariable int id) {
		Company company = service.findById(id);
		return company.getIpo();
	}	
	

}
