package com.bwjf.service;

import com.bwjf.entity.User;

import java.util.List;

public interface UserService {
    int insert(User record);
    List<User> userList();
     User findByUsername(String username);


}
