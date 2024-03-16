package org.aziz.customerservice.repository;

import org.aziz.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.nio.file.LinkOption;

/**
 * @author Aziz Moubsit
 **/
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
