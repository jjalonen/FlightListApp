package com.joonas.flight.flightinfotable.repository;

import java.util.List;

import com.joonas.flight.flightinfotable.entity.Status;
import org.springframework.data.repository.CrudRepository;

public interface StatusRepository extends CrudRepository<Status, Long> {

    List<Status> findByName(String name);

}
