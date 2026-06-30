package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.BookingRequest;
import model.Booking;
import repository.BookingRepository;


@Service
public class BookingService {
	
	@Autowired
	private BookingRepository bookingRepository;

	public Booking bookTicket(BookingRequest request) {
		return null;
	}
	
	public String canclBooking(Long id) {
		return null;
	}
	
	public List<Booking> getBookings(){
		return null;
		
	}
	
}
