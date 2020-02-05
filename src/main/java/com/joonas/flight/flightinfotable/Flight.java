package com.joonas.flight.flightinfotable;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Flight {

    private @Id
    @GeneratedValue Long id;
    private String depTime;
    private String destination;
    private String gate;

    private Flight() {}

    public Flight(String depTime, String destination, String gate) {
        this.depTime = depTime;
        this.destination = destination;
        this.gate = gate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(id, flight.id) &&
                Objects.equals(depTime, flight.depTime) &&
                Objects.equals(destination, flight.destination) &&
                Objects.equals(gate, flight.gate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, depTime, destination, gate);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepTime() {
        return depTime;
    }

    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", depTime='" + depTime + '\'' +
                ", destination='" + destination + '\'' +
                ", gate='" + gate + '\'' +
                '}';
    }
}