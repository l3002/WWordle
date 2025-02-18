package com.wwordle.service;

import com.wwordle.data.user.User;

import org.springframework.stereotype.Service;

@Service
public class UserService {

  public String saveUser(final User user) {
    return "User registered Successfully";
  }
}
