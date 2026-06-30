package controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Flight;

@RestController
@RequestMapping("/api/flights")
public class FlightController {
	
	@GetMapping
	ResponseEntity<List<Flight>> getAllFlights(){
		return null;
	}
	
	@GetMapping
	ResponseEntity<List<Flight>> searchFlights(){
		return null;
	}
	
	@PostMapping
	ResponseEntity<Flight> addFlight(){
		return null;
	}
	
}
