package com.example.StockMarketChartingApp.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StockMarketChartingApp.Repository.CompanyRepo;
import com.example.StockMarketChartingApp.Repository.IpoRepo;
import com.example.StockMarketChartingApp.Repository.sectorRepo;
import com.example.StockMarketChartingApp.model.Company;
import com.example.StockMarketChartingApp.model.IPO;
import com.example.StockMarketChartingApp.model.Sector;

@CrossOrigin("*")
@RestController
@RequestMapping("/")
public class CompanyController {

	@Autowired
	CompanyRepo repo;
	
	@Autowired
	IpoRepo ipoRepo;
		
	@Autowired
	sectorRepo sectRepo;
		
	@GetMapping("/getCompany/{id}")
	public Optional<Company> getCompany(@PathVariable Integer id) {
		 return repo.findById(id);
	}
	@GetMapping("/getAllCompanies")
	public List<Company> getAllCompanies() {
		return repo.findAll();
	}
	@GetMapping("/getIpoFromCompany/{id}")
	public IPO getIpoFromCompany(@PathVariable int id) {
		Company company = repo.findById(id).orElse(null);
		return company.getIpoId();
	}
	
	@PutMapping("/updateCompany/{id}")
	public Company updateCompany(@RequestBody Company company, @PathVariable int id) {
		company.setId(id);
		return repo.save(company);
	}
	
	@DeleteMapping("/deleteCompany/{id}")
	public String deleteStudent(@PathVariable int id) {
		repo.deleteById(id);
		return "delete successful";
	}
	
	@PostMapping("/addnewcompany")
	public String addNewCompany(@RequestBody Company company)
	{
			repo.save(company);
			return "New Company Added Successfully";
	}
	
	
	

	//ipo related data
	

}
