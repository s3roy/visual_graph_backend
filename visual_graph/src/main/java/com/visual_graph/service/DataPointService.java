package com.visual_graph.service;

import com.visual_graph.model.DataPoint;
import com.visual_graph.repository.DataPointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataPointService {

    private final DataPointRepository dataPointRepository;

    @Autowired
    public DataPointService(DataPointRepository dataPointRepository) {
        this.dataPointRepository = dataPointRepository;
    }

    public List<DataPoint> getAllDataPoints() {
        return dataPointRepository.findAll();
    }

    // Add more service methods as needed

}
