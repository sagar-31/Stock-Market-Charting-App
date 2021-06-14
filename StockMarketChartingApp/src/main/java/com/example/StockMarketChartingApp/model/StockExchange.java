package com.example.StockMarketChartingApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StockExchange")
public class StockExchange {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "stockExchangeName")
	private String stockExchangeName;
	@Column(name = "brief")
	private String brief;
	@Column(name = "address")
	private String address;
	@Column(name = "remarks")
	private String remarks;

}
