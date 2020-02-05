package com.joonas.flight.flightinfotable;

import com.joonas.flight.flightinfotable.entity.Flight;
import com.joonas.flight.flightinfotable.repository.AirportRepository;
import com.joonas.flight.flightinfotable.repository.FlightRepository;
import com.joonas.flight.flightinfotable.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    FlightRepository repository;

    @Autowired
    StatusRepository sRepository;

    @GetMapping(value = "/")
    public String index(Model model, Flight flight) {
        model.addAttribute("flight", new Flight());
        model.addAttribute("flights", repository.findAll());
        return "index";
    }

    @PostMapping("/addFlight")
    public String addFlight(Model model, Flight flight) {
        repository.save(flight);
        model.addAttribute("flight", new Flight());
        model.addAttribute("flights", repository.findAll());
        return "redirect:/";
    }

}