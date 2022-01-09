package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {
    Iterable<User> UserList();
    User addUser( User user);
    User updateUser (User user,Integer id );
    void deleteUserByid( Integer id);
}
