package com.example.StockMarketChartingApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "userName")
	private String userName;
	@Column(name = "password")
	private String password;
	@Column(name = "userType")
	private String userType;
	@Column(name = "email")
	private String email;
	@Column(name="mobileNumber")
	private String mobileNumber;
	@Column(name = "confirmed")
	private boolean confirmed;

}
