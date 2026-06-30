package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import com.dipesh.airline_reservation_system.model.User;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="bookings")
public class Booking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String bookingNumber;
	private String seatNumber;
	private String bookingStatus;
	private User user;
	private Flight flight;
	private LocalDateTime bookingDate;
	private LocalDate travelDate;
	private Double price;
	
	
	
}
