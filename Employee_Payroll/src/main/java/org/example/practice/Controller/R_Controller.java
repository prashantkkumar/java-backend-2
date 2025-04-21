package org.example.practice.Controller;

import org.example.practice.Model.User;
import org.example.practice.Service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/service")
public class R_Controller {

    @Autowired
    private service service;
    @GetMapping("/Getuser/{id}")
    public User GerUser(@PathVariable int id){
        return service.getUser(id);
    }

    @PostMapping("/PostUser")
    public User PostUser(@RequestBody User user){
        return service.SetUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public User deleteUser(@PathVariable int id){
        return service.DeleteById(id);
    }
}
