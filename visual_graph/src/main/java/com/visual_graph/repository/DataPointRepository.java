package com.visual_graph.repository;

import com.visual_graph.model.DataPoint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataPointRepository extends JpaRepository<DataPoint, Long> {

    // Add any custom query methods if needed

}

