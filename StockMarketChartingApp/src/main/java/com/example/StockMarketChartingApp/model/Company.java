package com.example.StockMarketChartingApp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "Company_Name")
	private String companyName;
	@Column(name = "Turnover")
	private long turnover;
	@Column(name = "Ceo")
	private String ceo;
	@Column(name = "board_of_Directors")
	private String boardOfDirectors;
	@Column(name = "Brief_Writeup")
	private String briefWriteup;
	@OneToOne(fetch = FetchType.LAZY)
	private IPO ipo;
	@ManyToMany(mappedBy = "companies")
	private List<StockExchange> stockExchanges = new ArrayList<>();
	@ManyToOne(fetch = FetchType.LAZY)
	private Sector sector;
	@OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
	private List<StockPrice> stockPrices = new ArrayList<>();

	public Company() {

	}

	public Company(String companyName, long turnover, String ceo, String boardOfDirectors, String sector,
			String briefWriteup) {
		super();
		this.companyName = companyName;
		this.turnover = turnover;
		this.ceo = ceo;
		this.boardOfDirectors = boardOfDirectors;
		this.briefWriteup = briefWriteup;
	}

	public Integer getId() {
		return id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public long getTurnover() {
		return turnover;
	}

	public void setTurnover(long turnover) {
		this.turnover = turnover;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}

	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}

	public String getBriefWriteup() {
		return briefWriteup;
	}

	public void setBriefWriteup(String briefWriteup) {
		this.briefWriteup = briefWriteup;
	}

	public IPO getIpo() {
		return ipo;
	}
	
	public List<StockExchange> getStockExchanges() {
		return stockExchanges;
	}

	public void setStockExchanges(List<StockExchange> stockExchanges) {
		this.stockExchanges = stockExchanges;
	}

	public Sector getSector() {
		return sector;
	}

	public void setSector(Sector sector) {
		this.sector = sector;
	}

	public List<StockPrice> getStockPrices() {
		return stockPrices;
	}

}
