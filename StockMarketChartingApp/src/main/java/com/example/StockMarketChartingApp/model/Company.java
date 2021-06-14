package com.example.StockMarketChartingApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "CompanyName")
	private String companyName;
	@Column(name = "Turnover")
	private long turnover;
	@Column(name = "Ceo")
	private String ceo;
	@Column(name = "BoardOfDirectors")
	private String boardOfDirectors;
	@Column(name = "Sector")
	private String sector;
	@Column(name = "BriefWriteup")
	private String briefWriteup;

	public Company() {

	}

	public Company(String companyName, long turnover, String ceo, String boardOfDirectors, String sector,
			String briefWriteup) {
		super();
		this.companyName = companyName;
		this.turnover = turnover;
		this.ceo = ceo;
		this.boardOfDirectors = boardOfDirectors;
		this.sector = sector;
		this.briefWriteup = briefWriteup;
	}

}

