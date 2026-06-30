package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
	
	List<Booking> findByUserId(Long userId);
	List<Booking> findByStatus(String status);
	Booking save();
	
}
