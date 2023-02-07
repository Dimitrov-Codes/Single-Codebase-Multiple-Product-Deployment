package com.example.profilemanager.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Burger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    String burgerName;
    String description;
    Integer price;

}
