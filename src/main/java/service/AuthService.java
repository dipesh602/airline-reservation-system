package service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.LoginRequest;
import dto.LoginResponse;
import dto.RegisterRequest;
import model.User;
import repository.UserRepository;

@Service
public class AuthService {
	
	@Autowired
	private UserRepository userRepository;
	
	public String register(RegisterRequest request){
		
		if(emailExists(request.getEmail())) {
			return "Email already registerd";
		}
		
		User user = new User();
		
		user.setName(request.getName());
		user.setEmail(request.getEmail());
		user.setPassword(request.getPassword());
		
		user.setRole("USER");
		user.setCreatedAt(LocalDateTime.now());
		
		userRepository.save(user);
		
		return "Registeration Succesfull";
	}
	
	public LoginResponse login(LoginRequest request) {
		
		LoginResponse response = new LoginResponse();
		
		User user = userRepository.findByEmail(request.getEmail());
		
		if(user == null) {
			response.setMessage("Invalid Email");
		}
		
		if(!user.getPassword().equals(request.getPassword())) {
			response.setMessage("Invalid Password");
			return response;
		}
		
		response.setMessage("Login Successfull");
		response.setRole(user.getRole());
		response.setToken("Dummy-Token");
		
		return response;
	
	}
	
	public boolean emailExists(String email) {
		return userRepository.existsByEmail(email) ;
		
	}
	
	
}
