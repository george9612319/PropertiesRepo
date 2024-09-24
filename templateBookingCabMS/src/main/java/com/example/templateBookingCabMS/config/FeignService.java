package com.example.templateBookingCabMS.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "TEMPLATECALCULATEFARE") // The name of the service registered in Eureka
public interface FeignService {
	
	@GetMapping("/calculateFare")
    ResponseEntity<Double> calculateFare(@RequestParam String fromLocation,
            @RequestParam String toLocation);
	
	

}
