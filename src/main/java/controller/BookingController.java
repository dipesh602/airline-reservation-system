package controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Booking;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
	
	@PostMapping
	ResponseEntity<Booking> bookTicket(){
		return null;
	}
	
	@GetMapping
	ResponseEntity<List<Booking>> getBooking(){
		return null;
	}
	
	@DeleteMapping("/{id}")
	ResponseEntity<String> cancelBooking(){
		return null;
	}
	
}
