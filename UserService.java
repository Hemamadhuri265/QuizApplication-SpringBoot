package com.Application.service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.Application.entity.User;
import com.Application.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo ;
	
	
	public  User SavingData(User user) {
		return repo.save(user);
	}
	
	public boolean UserLogin(String email, String password) {
		Optional<User> user = repo.findByEmailAndPassword(email, password);
		return user.isPresent();
	}
	
	 
	 // This method fetches a user by ID and returns an Optional
    public Optional<User> getUserById(Long userId) {
        return repo.findById(userId);
    }
    
    public void updateUserScore(String email, int score) {
        User user = repo.findByEmail(email);
        if (user != null) {
            user.setScore(score);
            repo.save(user);
        }
    }

	   
}
