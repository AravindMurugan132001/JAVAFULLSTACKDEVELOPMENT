package com.nseit.smsapplication.service;

import com.nseit.smsapplication.model.User;
import com.nseit.smsapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void add(User user) {
        userRepository.save(user);
    }

    public void update(User user) {
        userRepository.save(user);
    }

    public List<User> view() {
        return userRepository.findAll();
    }

    public void delete(Integer id) {
        for (User user : userRepository.findAll()) {
            if (id == user.getId()) {
                userRepository.delete(user);
            }
        }
    }
}
