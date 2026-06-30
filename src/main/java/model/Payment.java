package model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // It will create  getter , setter , hashcode , toString ...
@NoArgsConstructor   // It will create the No Argument Constructor Automatically , but we know the default no args cons... will be created by the JVM itself internally 
@AllArgsConstructor // It will automatically create Args constructor 
@Entity
@Table(name = "payments")
public class Payment {
	
	
	private Long id;
	private String paymentId,paymentMethod,paymentStatus;
	private  Double amount;
	private LocalDateTime paymentDate;
	

}
