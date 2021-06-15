package com.example.StockMarketChartingApp.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;





@Entity
@Table(name = "Sector")
public class Sector {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "SectorName")
	private String sectorName;
	@Column(name = "Brief")
	private String brief;
	@OneToMany(mappedBy = "sector",fetch = FetchType.LAZY)
	private List<Company> company =  new ArrayList<>();

}
