package com.example.StockMarketChartingApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.StockMarketChartingApp.model.Sector;

@Repository
public interface sectorRepo extends JpaRepository<Sector, Integer> {
	
//	@Query("SELECT s FROM Sector s WHERE  s.SectorName = :name",nativ =true)
//	Sector findByName(@Param("SectorName") String name);

}
