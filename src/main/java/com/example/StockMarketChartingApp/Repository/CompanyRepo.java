package com.example.StockMarketChartingApp.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StockMarketChartingApp.model.Company;
@Repository
public interface CompanyRepo extends JpaRepository<Company, Integer> {
	
	Company findByCompanyName(String companyName);
}
