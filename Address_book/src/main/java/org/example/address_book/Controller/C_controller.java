package org.example.address_book.Controller;

import org.example.address_book.Model.Address;
import org.example.address_book.Service.S_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Address")
public class C_controller {
    @Autowired
    S_Service service;

    @GetMapping("/Getvalue/{id}")
    public Address Getvalue(@PathVariable int id) {
        return service.get_Value(id);
    }

    @PostMapping("/PostValue")
    public Address PostValue(@RequestBody Address address) {
        return service.set_value(address);
    }

    @DeleteMapping("/delete/{id}")
    public Address Deletevalue(@PathVariable int id) {
        return service.Delete_value(id);
    }

    @PostMapping("/test1")
    public String Test1(@RequestBody Address address) {
        return "testing 1";
    }

}
