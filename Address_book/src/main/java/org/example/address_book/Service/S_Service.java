package org.example.address_book.Service;

import org.example.address_book.Model.Address;
import org.example.address_book.Repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class S_Service {
    @Autowired
    repository repository;

    public Address get_Value(int id){
        return repository.getOne(id);
    }

    public Address set_value(Address address){
        return repository.save(address);
    }

    public Address Delete_value(int id){
        Address address = repository.getOne(id);
        repository.delete(address);
        return address;
    }

}
