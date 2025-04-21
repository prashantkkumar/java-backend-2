package org.example.practice.Service;

import org.example.practice.Model.User;
import org.example.practice.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {

    @Autowired
    private UserRepository userRepository;

    public User getUser(int id){
        return userRepository.findById(id).orElseThrow();
    }

    public User SetUser(User user){
        return userRepository.save(user);
    }

    public User DeleteById(Integer id){
        User user = userRepository.findById(id).orElseThrow();
        userRepository.delete(user);
        return user;
    }
}
