package com.visual_graph.service;

import com.visual_graph.model.DataPoint;
import com.visual_graph.repository.DataPointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<String> getAllCities() {
        List<String> cities = dataPointRepository.findAllCities();
        return cities.stream()
                .filter(city -> !city.trim().isEmpty())
                .collect(Collectors.toList());
    }

    public List<String> getAllCountries() {
        List<String> cities = dataPointRepository.findAllCountries();
        return cities.stream()
                .filter(city -> !city.trim().isEmpty())
                .collect(Collectors.toList());
    }


}
