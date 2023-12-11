package com.wwordle.user;

import com.wwordle.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{
    
    @Autowired
    private UserRepository jpaRepository;

    public String saveUser(final User user){
        jpaRepository.save(user);
        return "User registered Successfully";
    }
}
