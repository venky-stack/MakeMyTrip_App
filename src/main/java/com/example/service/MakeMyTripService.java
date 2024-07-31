package com.example.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.binding.Passenger;
import com.example.binding.Ticket;

@Service
public class MakeMyTripService {
	
	public Ticket bookTicket(Passenger p) {
		
		String  apiurl="http://localhost:8080/ticket";
		RestTemplate rs = new RestTemplate();
		
		ResponseEntity<Ticket> postForEntity = rs.postForEntity(apiurl,p,Ticket.class);
		 Ticket body = postForEntity.getBody();
		 return body;
	}
	
	public List<Ticket> getTicket() {
		
		String apiUrl="http://localhost:8080/tickets";
		RestTemplate rs= new RestTemplate();
		
		ResponseEntity<Ticket> forEntity = rs.getForEntity(apiUrl,Ticket.class);
		Ticket body = forEntity.getBody();
		List<Ticket> asList = Arrays.asList(body);
		return asList;	
	}
}
