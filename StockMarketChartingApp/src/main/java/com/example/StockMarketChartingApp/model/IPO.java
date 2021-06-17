package com.example.StockMarketChartingApp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "IPO")
public class IPO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "companyName")
	private String companyName;
	@Column(name = "stockExchange")
	private String stockExchange;
	@Column(name = "price")
	private Long price;
	@Column(name = "numOfShares")
	private Long numOfShares;
	@Column(name = "dateTime")
	private Date dateTime;
	@Column(name = "remarks")
	private String remarks;
	@OneToOne(mappedBy = "ipo",fetch = FetchType.LAZY)
	private Company company;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public Long getNumOfShares() {
		return numOfShares;
	}
	public void setNumOfShares(Long numOfShares) {
		this.numOfShares = numOfShares;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Integer getId() {
		return id;
	}
	
	

}
