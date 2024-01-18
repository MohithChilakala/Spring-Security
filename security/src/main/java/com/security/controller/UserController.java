package com.security.controller;

import com.security.entity.User;
import com.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
      @Autowired private UserService userService;

      @GetMapping("")
      public String sayHello() {
            return "Hello";
      }

      @PostMapping("/add")
      public void saveUser(@RequestBody User user) {
            userService.save(user);
      }

      @GetMapping("/get-all")
      public List<User> getAllUsers() {
            return userService.getUsers();
      }

      @GetMapping("/get/{id}")
      public User getUser(@PathVariable long id) {
            return userService.getUser(id);
      }
}
