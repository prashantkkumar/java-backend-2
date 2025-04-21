package org.example.address_book.Repository;

import org.example.address_book.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repository extends JpaRepository <Address,Integer> {

}
