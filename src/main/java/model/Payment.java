package model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "payments")
public class Payment {
	
	
	private Long id;
	private String paymentId,paymentMethod,paymentStatus;
	private  Double amount;
	private LocalDateTime paymentDate;
	
	
	public Payment(Long id, String paymentId, String paymentMethod, String paymentStatus, Double amount,
			LocalDateTime paymentDate) {
		super();
		this.id = id;
		this.paymentId = paymentId;
		this.paymentMethod = paymentMethod;
		this.paymentStatus = paymentStatus;
		this.amount = amount;
		this.paymentDate = paymentDate;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getPaymentId() {
		return paymentId;
	}


	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}


	public String getPaymentMethod() {
		return paymentMethod;
	}


	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}


	public String getPaymentStatus() {
		return paymentStatus;
	}


	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}


	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}


	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	
	
	
	
}
