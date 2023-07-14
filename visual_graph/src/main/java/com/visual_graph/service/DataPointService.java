package com.visual_graph.service;

import com.visual_graph.model.DataPoint;
import com.visual_graph.repository.DataPointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
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

    public List<Integer> getAllStartYear() {
    List<Integer> startYears = dataPointRepository.findAllStartYear();
    return startYears.stream()
            .filter(startYear -> startYear != null)
            .collect(Collectors.toList());
    }

    public List<Integer> getAllEndYear() {
    List<Integer> endYears = dataPointRepository.findAllEndYear();
    return endYears.stream()
            .filter(endYear -> endYear != null)
            .collect(Collectors.toList());
    }

    public Map<String, Integer> getCountBySector(String sortBy, String filterValue) {
        List<DataPoint> dataPoints = fetchDataPointsFromDatabase(sortBy, filterValue);

        return dataPoints.stream()
                .collect(Collectors.toMap(DataPoint::getSector, v -> 1, Integer::sum));
    }

    private List<DataPoint> fetchDataPointsFromDatabase(String sortBy, String filterValue) {
        if (sortBy != null && filterValue != null) {
            switch (sortBy) {
                case "city":
                    return dataPointRepository.findAllByCity(filterValue);
                case "country":
                    return dataPointRepository.findAllByCountry(filterValue);
                case "startYear":
                    return dataPointRepository.findAllByStartYear(Integer.parseInt(filterValue));
                case "endYear":
                    return dataPointRepository.findAllByEndYear(Integer.parseInt(filterValue));
                default:
                    throw new IllegalArgumentException("Invalid sortBy parameter: " + sortBy);
            }
        } else {
            return dataPointRepository.findAll();
        }
    }




}
