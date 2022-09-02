package com.nseit.smsapplication.service;

import com.nseit.smsapplication.model.Users;
import com.nseit.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    private com.nseit.smsapplication.repository.UsersRepository usersRepository;

    public void addUser(Users users) {
        usersRepository.save(users);
    }

    public void updateUser(Users users) {
        usersRepository.save(users);
    }

    public List<Users> viewUser() {

        return usersRepository.findAll();
    }

    public void deleteUser(int id) {
        for(Users users : usersRepository.findAll()){
            if(id== users.getId()){
                usersRepository.delete(users);
            }
        }

    }
}
