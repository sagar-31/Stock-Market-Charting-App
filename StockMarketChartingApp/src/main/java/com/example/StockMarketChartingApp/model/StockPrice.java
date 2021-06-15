package com.example.StockMarketChartingApp.model;

import java.sql.Date;
import java.sql.Time;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "stockPrice")
public class StockPrice {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "CompanyCode")
	private Integer CompanyCode;
	@Column(name = "stockExchange")
	private String stockExchange;
	@Column(name = "price")
	private String price;
	@Column(name = "date")
	private Date date;
	@Column(name = "time")
	private Time time;
	@Column(name = "BriefWriteup")
	private String briefWriteup;
	@ManyToOne(fetch = FetchType.LAZY)
	private Company company;
	public Integer getCompanyCode() {
		return CompanyCode;
	}
	public void setCompanyCode(Integer companyCode) {
		CompanyCode = companyCode;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public String getBriefWriteup() {
		return briefWriteup;
	}
	public void setBriefWriteup(String briefWriteup) {
		this.briefWriteup = briefWriteup;
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
