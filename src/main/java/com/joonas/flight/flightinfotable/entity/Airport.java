package com.joonas.flight.flightinfotable.entity;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Airport {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long airport_id;
    private String destination;
    private String country;

    public Airport() {}

    public Airport(String destination, String country) {
        this.destination = destination;
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(airport_id, airport.airport_id) &&
                Objects.equals(destination, airport.destination) &&
                Objects.equals(country, airport.country);
    }

    @Override
    public int hashCode() {

        return Objects.hash(airport_id, country);
    }

    public Long getId() {
        return airport_id;
    }

    public void setId(Long airport_id) {
        this.airport_id = airport_id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "airport_id=" + airport_id +
                ", country'" + country + '\'' +
                '}';
    }
}