package service;

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
	
	public User register(RegisterRequest request){
		return null;
	}
	
	public LoginResponse login(LoginRequest request) {
		return null;
	
	}
	
	public boolean emailExist(String email) {
		return false;
		
	}
	
	
}
