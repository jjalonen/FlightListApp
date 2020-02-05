package com.joonas.flight.flightinfotable.entity;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Airport {

    private @Id
    @GeneratedValue Long id;
    private String airPortName;
    private String city;
    private String country;

    private Airport() {}

    public Airport(String airPortName, String city, String country) {
        this.airPortName = airPortName;
        this.city = city;
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(id, airport.id) &&
                Objects.equals(airPortName, airport.airPortName) &&
                Objects.equals(city, airport.city) &&
                Objects.equals(country, airport.country);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, airPortName, city, country);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAirPortName() {
        return airPortName;
    }

    public void setAirPortName(String airPortName) {
        this.airPortName = airPortName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
                "id=" + id +
                ", airPortName='" + airPortName + '\'' +
                ", city='" + city + '\'' +
                ", country'" + country + '\'' +
                '}';
    }
}