package com.joonas.flight.flightinfotable.controller;

import com.joonas.flight.flightinfotable.entity.Flight;
import com.joonas.flight.flightinfotable.repository.AirportRepository;
import com.joonas.flight.flightinfotable.repository.FlightRepository;
import com.joonas.flight.flightinfotable.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @Autowired
    FlightRepository repository;

    @Autowired
    StatusRepository sRepository;

    @Autowired
    AirportRepository aRepository;

    @GetMapping(value = "/index")
    public String index(Model model) {
        model.addAttribute("flight", new Flight());
        model.addAttribute("flights", repository.findAll());
        model.addAttribute("statuses", sRepository.findAll());
        model.addAttribute("airports", aRepository.findAll());
        return "index";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Flight flight) {
        repository.save(flight);
        return "redirect:index";
    }

}