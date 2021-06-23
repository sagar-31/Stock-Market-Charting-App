package com.example.StockMarketChartingApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.StockMarketChartingApp.Repository.IpoRepo;
import com.example.StockMarketChartingApp.Service.IpoService;
import com.example.StockMarketChartingApp.model.IPO;

@CrossOrigin("*")
@RestController
public class IpoController {
	
	@Autowired
	IpoRepo repo;
	
	@GetMapping("/getAllIpos")
	public List<IPO> getAllIpos(){
		return repo.findAll();
	}
	@PutMapping("/updateIpo")
	public String updateIpo(@RequestBody IPO ipo) {
		repo.save(ipo);
		return "IPO Updated";
	}
	@PostMapping("/addIpo")
	public String addIpo(@RequestBody IPO ipo) {
		repo.save(ipo);
		return "IPO published";
	}
	

}
