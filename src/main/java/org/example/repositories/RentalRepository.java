package org.example.repositories;

import org.example.entities.Rental;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RentalRepository extends JpaRepository<Rental, Long> {
}


