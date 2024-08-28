package com.amac.SpringSecEx.service;

import com.amac.SpringSecEx.model.Users;
import com.amac.SpringSecEx.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public Users register(Users user) {
        return userRepo.save(user);
    }
}

