package com.joonas.flight.flightinfotable;

import com.joonas.flight.flightinfotable.entity.Airport;
import com.joonas.flight.flightinfotable.entity.Flight;
import com.joonas.flight.flightinfotable.entity.Status;
import com.joonas.flight.flightinfotable.repository.FlightRepository;
import com.joonas.flight.flightinfotable.repository.StatusRepository;
import com.joonas.flight.flightinfotable.repository.AirportRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FlightinfotableApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightinfotableApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(FlightRepository repository, StatusRepository sRepository, AirportRepository aRepository) {
		return (args) -> {

			Status s1 = new Status();
			s1.setName("-");
			sRepository.save(s1);

			Status s2 = new Status();
			s2.setName("CHECK-IN");
			sRepository.save(s2);

			Status s3 = new Status();
			s3.setName("GO TO GATE");
			sRepository.save(s3);

			Status s4 = new Status();
			s4.setName("FINAL CALL");
			sRepository.save(s4);

			Status s5 = new Status();
			s5.setName("GATE CLOSED");
			sRepository.save(s5);

			Status s6 = new Status();
			s6.setName("DEPARTED");
			sRepository.save(s6);

			repository.save(new Flight("11:30", "Tokyo", "23", s6));
			repository.save(new Flight("12:15", "Budapest", "13", s5));
			repository.save(new Flight("12:20", "London", "02", s4));
			repository.save(new Flight("12:30", "Brussels", "10", s3));
			repository.save(new Flight("13:45", "Oulu", "22", s2));
			repository.save(new Flight("16:55", "Madrid", "", s1));

		};
	}

}
