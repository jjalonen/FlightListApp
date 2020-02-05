package com.joonas.flight.flightinfotable.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long status_id;
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "status")
    private List<Flight> flights;

    public Status() {
    }

    public Status(String name, List<Flight> flights) {
        super();
        this.name = name;
        this.flights = flights;
    }

    public Long getStatusId() {
        return status_id;
    }

    public void setStatusId(Long status_id) {
        this.status_id = status_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    @Override
    public String toString() {
        return "Status [statusId=" + status_id + ", name=" + name + "]";
    }
}