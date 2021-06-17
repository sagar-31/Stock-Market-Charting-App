package com.example.StockMarketChartingApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.StockMarketChartingApp.Repository.CompanyRepo;
import com.example.StockMarketChartingApp.model.Company;

@Service
public class CompanyService {
	@Autowired
	CompanyRepo repo;


}
