package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long>{

	List<Flight> findBySource(String source);
	List<Flight> findByDestination(String destination);
	List<Flight> findBySourceAndDestination(String source,String destination);
	//Flight save();
	
	
}
