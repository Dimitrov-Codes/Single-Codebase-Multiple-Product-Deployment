package com.example.profilemanager.repositories;

import com.example.profilemanager.models.Burger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BurgerRepository extends JpaRepository<Burger, Long> {
}
