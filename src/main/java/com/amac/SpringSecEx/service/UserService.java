package com.amac.SpringSecEx.service;

import com.amac.SpringSecEx.model.Users;
import com.amac.SpringSecEx.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private JWTService jwtService;

    @Autowired
    AuthenticationManager authManager;

    public Users register(Users user) {
        return userRepo.save(user);
    }

    public String verifyUser(Users user) {
        Authentication authentication =
                authManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
        if(authentication.isAuthenticated()) {
            return jwtService.generateToken(user.getUsername());
        } else {
            return "User is not authenticated";
        }
    }
}

