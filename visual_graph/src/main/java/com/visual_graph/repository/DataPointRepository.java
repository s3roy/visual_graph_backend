package com.visual_graph.repository;

import com.visual_graph.model.DataPoint;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List; // Import List from java.util package

public interface DataPointRepository extends JpaRepository<DataPoint, Long> {

    // Add any custom query methods if needed
	
    @Query("SELECT DISTINCT d.city FROM DataPoint d")
    List<String> findAllCities();

    @Query("SELECT DISTINCT d.country FROM DataPoint d")
    List<String> findAllCountries();

    @Query("SELECT DISTINCT d.startYear FROM DataPoint d")
    List<Integer> findAllStartYear();

    @Query("SELECT DISTINCT d.endYear FROM DataPoint d")
    List<Integer> findAllEndYear();


}
