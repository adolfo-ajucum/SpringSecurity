package com.amac.SpringSecEx.service;

import com.amac.SpringSecEx.model.UserPrincipal;
import com.amac.SpringSecEx.model.Users;
import com.amac.SpringSecEx.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users users = repo.findByUsername(username);

        if(users != null){
            System.out.println(users);
            throw new UsernameNotFoundException("User 404");
        }



        return new UserPrincipal(users);
    }
}
