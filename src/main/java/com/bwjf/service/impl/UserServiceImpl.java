package com.bwjf.service.impl;

import com.bwjf.entity.User;
import com.bwjf.mapper.UserMapper;
import com.bwjf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

     @Autowired
     private UserMapper userMapper;

    @Override
    public int insert(User record) {

        return userMapper.insert(record);
    }

    @Override
    public List<User> userList() {
        return userMapper.userList();
    }

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
