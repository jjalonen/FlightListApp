package com.joonas.flight.flightinfotable.repository;

import com.joonas.flight.flightinfotable.entity.Flight;
import org.springframework.data.repository.CrudRepository;

public interface FlightRepository extends CrudRepository<Flight, Long> {

}
