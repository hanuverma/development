package com.headway.tutorial.spring.dao;

import java.util.List;

import com.headway.tutorial.spring.entity.User;

public interface UserDao {
   void add(User user);
   List<User> listUsers();
}
