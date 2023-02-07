package com.example.profilemanager.services;

import com.example.profilemanager.config.BurgersConfig;
import com.example.profilemanager.dto.ResponseDTO;
import com.example.profilemanager.models.Burger;
import com.example.profilemanager.repositories.BurgerRepository;
import org.springframework.stereotype.Service;

@Service
public class BurgerService {
    private final BurgerRepository burgerRepository;
    private final BurgersConfig config;

    public BurgerService(BurgerRepository burgerRepository, BurgersConfig config) {
        this.burgerRepository = burgerRepository;
        this.config = config;
    }

    public ResponseDTO<Burger> convertRequestToDTO(){
        ResponseDTO<Burger> res = new ResponseDTO<>();
        res.setOrderLaterEnabled(config.isOrderLaterEnabled());
        res.setStylesheet(config.getStylesheet());
        res.setMenuItems(burgerRepository.findAll());
        return res;
    }
}
