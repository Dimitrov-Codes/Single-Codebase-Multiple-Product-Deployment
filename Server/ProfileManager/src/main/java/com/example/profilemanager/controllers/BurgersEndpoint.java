package com.example.profilemanager.controllers;

import com.example.profilemanager.dto.ResponseDTO;
import com.example.profilemanager.models.Burger;
import com.example.profilemanager.models.Juice;
import com.example.profilemanager.services.BurgerService;
import com.example.profilemanager.services.JuiceService;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("burger-delv")
@RequestMapping("burgers")
public class BurgersEndpoint {
    private final BurgerService burgerService;

    public BurgersEndpoint(BurgerService burgerService, JuiceService juiceService) {
        this.burgerService = burgerService;
    }

    @GetMapping("/getData")
    public ResponseDTO<Burger> getBurgerData() {
        return burgerService.convertRequestToDTO();
    }


}
