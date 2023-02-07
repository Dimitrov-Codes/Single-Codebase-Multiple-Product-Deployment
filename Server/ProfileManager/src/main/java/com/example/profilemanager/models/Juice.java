package com.example.profilemanager.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Juice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String juiceName;
    String description;
    Integer price;
}
