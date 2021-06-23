package com.example.StockMarketChartingApp.excel.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.example.StockMarketChartingApp.excel.dao.*;
import com.example.StockMarketChartingApp.excel.services.*;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;

@CrossOrigin("*")
@RestController
public class excelController
{
    @Autowired
    ExcelService es;
    @Autowired
    ExcelRepository er;
    

    
    @PostMapping(value="/excel/uploadExcel")
    public String uploadExcel(@RequestParam MultipartFile file) throws IOException, ParseException, SQLException
    {

        es.uploadExcel(file);
        return "Excel file uploaded successfully";
    }

}

