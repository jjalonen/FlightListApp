package com.joonas.flight.flightinfotable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final FlightRepository repository;

    @Autowired
    public DatabaseLoader(FlightRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Flight("10:20", "New York", "07"));
        this.repository.save(new Flight("10:40", "Milan", "21"));
    }
}
