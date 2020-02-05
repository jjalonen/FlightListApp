package com.joonas.flight.flightinfotable.repository;

import com.joonas.flight.flightinfotable.entity.Airport;
import org.springframework.data.repository.CrudRepository;

public interface AirportRepository extends CrudRepository<Airport, Long> {

}