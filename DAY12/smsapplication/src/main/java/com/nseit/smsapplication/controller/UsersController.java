package com.nseit.smsapplication.controller;

import com.nseit.smsapplication.model.Users;
import com.nseit.smsapplication.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class UsersController {
    @Autowired
    private UsersService usersService;

    @PostMapping
    public void addUser(@RequestBody Users users) {
        usersService.addUser(users);
    }

    @PutMapping
    public void updateUser(@RequestBody Users users) {
        usersService.updateUser(users);
    }

    @GetMapping("/all")
    public List<Users> viewUser() {
        return usersService.viewUser();
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        usersService.deleteUser(id);
    }


}


