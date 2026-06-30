package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Payment;


public interface PaymentRepository extends JpaRepository<Payment, Long>{
	
	List<Payment> findByPayentStatus(String paymenStatus);
	
}
