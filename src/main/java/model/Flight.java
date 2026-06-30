package model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="flights")
public class Flight {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(unique=true)
	private String flightNumber;
	private String airlineName,source,destination,status;
	private Integer availableSeats,totalSeats;
	private Double price;
	private LocalDateTime depatureTime,arrivalTime;
	
	
	public Flight(Long id, String flightNumber, String airlineName, String source, String destination, String status,
			Integer availableSeats, Integer totalSeats, Double price, LocalDateTime depatureTime,
			LocalDateTime arrivalTime) {
		super();
		this.id = id;
		this.flightNumber = flightNumber;
		this.airlineName = airlineName;
		this.source = source;
		this.destination = destination;
		this.status = status;
		this.availableSeats = availableSeats;
		this.totalSeats = totalSeats;
		this.price = price;
		this.depatureTime = depatureTime;
		this.arrivalTime = arrivalTime;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFlightNumber() {
		return flightNumber;
	}


	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}


	public String getAirlineName() {
		return airlineName;
	}


	public void setAirlineName(String airlinename) {
		this.airlineName = airlinename;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Integer getAvailableSeats() {
		return availableSeats;
	}


	public void setAvailableSeats(Integer availableSeats) {
		this.availableSeats = availableSeats;
	}


	public Integer getTotalSeats() {
		return totalSeats;
	}


	public void setTotalSeats(Integer totalSeats) {
		this.totalSeats = totalSeats;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public LocalDateTime getDepatureTime() {
		return depatureTime;
	}


	public void setDepatureTime(LocalDateTime depatureTime) {
		this.depatureTime = depatureTime;
	}


	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}


	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	
	
	
	
}
