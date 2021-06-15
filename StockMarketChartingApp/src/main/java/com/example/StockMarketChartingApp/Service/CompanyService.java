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

	public Company saveCompany(Company company) {
		return repo.save(company);
	}

	public List<Company> getCompanies() {
		return repo.findAll();
	}

	public Company findById(int id) {
		return repo.findById(id).orElse(null);
	}

	public Company updateCompany(Company company) {
		Company existingCompany = repo.findById(company.getId()).orElse(null);
		existingCompany.setTurnover(company.getTurnover());
		existingCompany.setCeo(company.getCeo());
		existingCompany.setBoardOfDirectors(company.getBoardOfDirectors());
		existingCompany.setBriefWriteup(company.getBriefWriteup());
		return repo.save(existingCompany);
	}

	public void deleteCompany(int id) {
		repo.deleteById(id);
	}

	public boolean isNameUnique(String companyName) {
		Company company = repo.findByCompanyName(companyName);
		if (company != null) {
			return false;
		} else {
			return true;
		}
	}

}
