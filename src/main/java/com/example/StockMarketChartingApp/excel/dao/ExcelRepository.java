package com.example.StockMarketChartingApp.excel.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StockMarketChartingApp.excel.entities.*;



@Repository
public interface ExcelRepository extends JpaRepository<stockPriceEntity,Long>
{



}
