package com.apap.tu04.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apap.tu04.model.FlightModel;


@Repository
public interface FlightDb extends JpaRepository<FlightModel, Long> {
}