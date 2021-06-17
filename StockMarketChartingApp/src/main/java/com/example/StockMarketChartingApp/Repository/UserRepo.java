package com.example.StockMarketChartingApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StockMarketChartingApp.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
