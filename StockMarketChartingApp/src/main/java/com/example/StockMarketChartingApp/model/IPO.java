package com.example.StockMarketChartingApp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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

}
