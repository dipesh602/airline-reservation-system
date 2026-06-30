package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.FlightRequest;
import model.Flight;
import repository.FlightRepository;

@Service
public class FlightService {
	
	@Autowired
	private FlightRepository flightRepository;
	
	public Flight addFlight(FlightRequest flightRequest) {
		return null;
		
	}
	
	public List<Flight> getAllFlight(){
		return null;
		
	}
	
	
	public Flight updateFlight(Long id,FlightRequest request) {
		return null;
	}
	
	void deleteFlight(Long id) {
		
	}
}
