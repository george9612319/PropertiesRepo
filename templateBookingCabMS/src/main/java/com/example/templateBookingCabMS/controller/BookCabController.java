package com.example.templateBookingCabMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.templateBookingCabMS.model.Cab;

@RestController
@RequestMapping(path="cab")
public class BookCabController{
	
	@Autowired
	Cab cab;
	@Autowired
	FeignService feignService;
	
	
	// highly Recommended
	// highly Recommended
	
	
	@PostMapping("/addtwo") // spring created
	public String addBookedCabtwo(@RequestBody Cab cab) {
		
		
		// Reach out to the Calculate Fare MicroService, to calculate the Fare
		// internally.
//		String url = "http://localhost:8084/calculateFare";
//		String url = "http://TEMPLATECALCULATEFARE/calculateFare";
		// Build the URL with query parameters
	//	String uri = UriComponentsBuilder.fromHttpUrl(url).queryParam("fromLocation", cab.getFromLocation())
//				.queryParam("toLocation", cab.getToLocation()).toUriString();
		// Create an HttpEntity to hold any request headers (if needed)
//		HttpEntity<Void> entity = new HttpEntity<>(null);
		//HttpEntity<Double> entity = new HttpEntity<>(null);
		// Exchange method to perform the GET request
		//ResponseEntity<Double> response = restTemplate.exchange(uri, HttpMethod.GET, entity, Double.class);
		ResponseEntity<Double> calcFareResponse  =  feignService.calculateFare(cab.getFromLocation(), cab.getToLocation());
		
		
		Double calculatedFare = calcFareResponse.getBody(); //20.0
		// Add that fare we get back, to our CAB OBJECT that we received.
		cab.setRate(calculatedFare);
		
		//Sending the Cab Object to the DB, then returning the successful send to the client WITH
		//extra information detailing the Fare PRICE.
		
		//redirect to a new page? --serving web content
		
		//send JSON back to FRONT END, which can do whatever you want with it.
		
		
		return cab.toString();
	}
	}
	
	
	


