package com.example.StockMarketChartingApp.model;

import java.sql.Date;
import java.sql.Time;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

}
