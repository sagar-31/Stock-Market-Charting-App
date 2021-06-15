package com.example.StockMarketChartingApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StockMarketChartingApp.Repository.IpoRepo;
import com.example.StockMarketChartingApp.model.IPO;



@Service
public class IpoService {
	
	@Autowired
	IpoRepo repository;
	
	public IPO saveIpo(IPO ipo) {
		return repository.save(ipo);
	}
	
	public IPO updateIpo(IPO ipo) {
		IPO existingIpo = repository.findById(ipo.getId()).orElse(null);
		existingIpo.setPrice(ipo.getPrice());
		existingIpo.setNumOfShares(ipo.getNumOfShares());
		existingIpo.setDateTime(ipo.getDateTime());
		existingIpo.setRemarks(ipo.getRemarks());
		return repository.save(existingIpo);
	}
	
	public List<IPO> getIpos() {
		return repository.findAll();
	}

}
