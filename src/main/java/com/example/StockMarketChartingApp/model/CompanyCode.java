package com.example.StockMarketChartingApp.model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class CompanyCode {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(nullable = false)
	private Long companyCode;
	
	@ManyToOne
	private Company company;
	
	@ManyToOne
	private StockExchange stockExchange;

	@OneToMany(mappedBy = "code", fetch=FetchType.LAZY)
	private List<StockPrice> stockPrices;
	
	public int getId() {
		return id;
	}

	public Long getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(Long companyCode) {
		this.companyCode = companyCode;
	}

	@JsonBackReference(value = "companyCode-company")
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@JsonBackReference(value = "companyCode-stockExchange")
	public StockExchange getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(StockExchange stockExchange) {
		this.stockExchange = stockExchange;
	}

	@JsonManagedReference(value = "stockPrice-companyCode")
	public List<StockPrice> getStockPrice() {
		return stockPrices;
	}

	public void addStockPrice(StockPrice stockPrice) {
		this.stockPrices.add(stockPrice);
	}

	public CompanyCode() {
		super();
	}

	public CompanyCode(Long companyCode) {
		super();
		this.companyCode = companyCode;
	}

}
