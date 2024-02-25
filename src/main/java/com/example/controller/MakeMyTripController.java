package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.binding.Passenger;
import com.example.binding.Ticket;
import com.example.service.MakeMyTripService;


@Controller
public class MakeMyTripController {
	
	@Autowired
	private MakeMyTripService service;
	
	@PostMapping("/ticketview")
	public String ticketBooking(@ModelAttribute("p") Passenger p, Model model) {
		Ticket bookTicket = service.bookTicket(p);
		model.addAttribute("msg","Your Ticket Booked ID:"+ bookTicket.getTicketId());
		return "ticket";
	}
	
	@GetMapping("/book-ticket")
	public String bookTickets(Model model) {
		model.addAttribute("p", new Passenger());
		return "ticket";
	}
	
	@GetMapping("/tickets")
	public String getTickets(Model model) {	
		List<Ticket> ticket = service.getTicket();
		model.addAttribute("tickets", ticket);
		return "index";
	}
}