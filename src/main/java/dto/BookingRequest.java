package dto;

import lombok.Data;

@Data
public class BookingRequest {

	private Long userId;
	private Long flightId;
	private Integer passangerCount;
	private String seatClass;
	
	
	public BookingRequest(Long userId, Long flightId, Integer passangerCount, String seatClass) {
		super();
		this.userId = userId;
		this.flightId = flightId;
		this.passangerCount = passangerCount;
		this.seatClass = seatClass;
	}


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public Long getFlightId() {
		return flightId;
	}


	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}


	public Integer getPassangerCount() {
		return passangerCount;
	}


	public void setPassangerCount(Integer passangerCount) {
		this.passangerCount = passangerCount;
	}


	public String getSeatClass() {
		return seatClass;
	}


	public void setSeatClass(String seatClass) {
		this.seatClass = seatClass;
	}
	
	
	
	
	
	
	
	
	
	
}
