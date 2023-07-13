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

    @GetMapping
    public List<DataPoint> getAllDataPoints() {
    	System.out.print("Data point is hitted");
        return dataPointService.getAllDataPoints();
    }

    // Add more endpoint methods as needed

}
