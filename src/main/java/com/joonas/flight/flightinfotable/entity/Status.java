package com.joonas.flight.flightinfotable.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long statusId;
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "status")
    private List<Flight> flights;

    public Status() {
    }

    public Status(String name, List<Flight> flights) {
        super();
        this.name = name;
        this.flights = flights;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
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
        return "Status [statusId=" + statusId + ", name=" + name + "]";
    }
}