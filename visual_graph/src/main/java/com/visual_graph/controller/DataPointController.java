package com.visual_graph.controller;

import com.visual_graph.model.DataPoint;
import com.visual_graph.service.DataPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/data-points")
public class DataPointController {

    private final DataPointService dataPointService;

    @Autowired
    public DataPointController(DataPointService dataPointService) {
        this.dataPointService = dataPointService;
    }

    @GetMapping("/api")
    public List<DataPoint> getAllDataPoints() {
        System.out.println("Data points endpoint is hit");
        return dataPointService.getAllDataPoints();
    }

    @GetMapping("/cities")
    public List<String> getAllCities() {
        System.out.println("List of cities endpoint is hit");
        return dataPointService.getAllCities();
    }

    @GetMapping("/countries")
    public List<String> getAllCountries() {
        System.out.println("List of countries endpoint is hit");
        return dataPointService.getAllCountries();
    }

    @GetMapping("/start-years")
    public List<Integer> getAllStartYear() {
        System.out.println("List of startdate endpoint is hit");
        return dataPointService.getAllStartYear();
    }

    @GetMapping("/end-years")
    public List<Integer> getAllEndYear() {
        System.out.println("List of enddate endpoint is hit");
        return dataPointService.getAllEndYear();
    }
}
