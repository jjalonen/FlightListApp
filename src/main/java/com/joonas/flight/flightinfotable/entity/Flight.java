package com.joonas.flight.flightinfotable.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Objects;
import javax.persistence.*;

@Entity
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String depTime;
    private String destination;
    private String gate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore

    @JoinColumn(name = "status_id")

    private Status status;

    public Flight() {
        super();
    }

    public Flight(String depTime, String destination, String gate, Status status) {
        this.depTime = depTime;
        this.destination = destination;
        this.gate = gate;
        this.status = status;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        if (this.status != null)
            return "Flight [id=" + id +
                    ", depTime='" + depTime + '\'' +
                    ", destination='" + destination + '\'' +
                    ", gate='" + gate + '\'' +
                    ']' + this.getStatus() + ']';
        else
            return "Flight [id=" + id +
                    ", depTime='" + depTime + '\'' +
                    ", destination='" + destination + '\'' +
                    ", gate='" + gate + '\'' +
                    ']';

    }
}