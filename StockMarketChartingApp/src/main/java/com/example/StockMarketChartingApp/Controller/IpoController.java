package com.example.StockMarketChartingApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.StockMarketChartingApp.Service.IpoService;
import com.example.StockMarketChartingApp.model.IPO;


@RestController
public class IpoController {
	
	@Autowired
	IpoService service;
	
	@PutMapping("/updateIpo")
	public IPO updateIpo(@RequestBody IPO ipo) {
		return service.updateIpo(ipo);
	}
	
	@GetMapping("/ipos")
	public List<IPO> getIpos(){
		return service.getIpos();
	}

}
