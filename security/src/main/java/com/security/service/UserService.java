package com.security.service;

import com.security.entity.User;
import com.security.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
      @Autowired private UserRepository userRepository;

      @Transactional
      public void save(User user) {
            userRepository.save(user);
      }

      public List<User> getUsers() {
            return userRepository.findAll();
      }

      public User getUser(long id) {
            return userRepository.findById(id).orElse(null);
      }
}
