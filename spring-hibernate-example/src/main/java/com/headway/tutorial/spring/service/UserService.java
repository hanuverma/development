package com.headway.tutorial.spring.service;

import java.util.List;

import com.headway.tutorial.spring.entity.User;

public interface UserService {
    void add(User user);
    List<User> listUsers();
}
