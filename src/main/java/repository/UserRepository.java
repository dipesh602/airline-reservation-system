package repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
	boolean existByEmail(String email);
	//List<User> findAllUser();
	//User saveUser();
	//void deleteById(Long id);
	
	
}
