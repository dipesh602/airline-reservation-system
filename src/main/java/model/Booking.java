package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

//import com.dipesh.airline_reservation_system.model.User;

@Data
@Entity
@Table(name="bookings")
public class Booking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String bookingNumber,seatNumber,bookingStatus;
	private User user;
	private Flight flight;
	private LocalDateTime bookingDate;
	private LocalDate travelDate;
	private Double price;
	
	
	public Booking(Long id, String bookingNumber, String seatNumber, String bookingStatus, User user, Flight flight,
			LocalDateTime bookingDate, LocalDate travelDate, Double price) {
		super();
		this.id = id;
		this.bookingNumber = bookingNumber;
		this.seatNumber = seatNumber;
		this.bookingStatus = bookingStatus;
		this.user = user;
		this.flight = flight;
		this.bookingDate = bookingDate;
		this.travelDate = travelDate;
		this.price = price;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getBookingNumber() {
		return bookingNumber;
	}


	public void setBookingNumber(String bookingNumber) {
		this.bookingNumber = bookingNumber;
	}


	public String getSeatNumber() {
		return seatNumber;
	}


	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}


	public String getBookingStatus() {
		return bookingStatus;
	}


	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Flight getFlight() {
		return flight;
	}


	public void setFlight(Flight flight) {
		this.flight = flight;
	}


	public LocalDateTime getBookingDate() {
		return bookingDate;
	}


	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}


	public LocalDate getTravelDate() {
		return travelDate;
	}


	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
	
	
	
	
	
	
}
