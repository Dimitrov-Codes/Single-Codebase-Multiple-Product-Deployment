package com.example.profilemanager.services;

import com.example.profilemanager.config.JuiceConfig;
import com.example.profilemanager.dto.ResponseDTO;
import com.example.profilemanager.models.Juice;
import com.example.profilemanager.repositories.JuiceRepository;
import org.springframework.stereotype.Service;

@Service
public class JuiceService {
    private final JuiceRepository juiceRepository;
    private final JuiceConfig config;
    public JuiceService(JuiceRepository juiceRepository, JuiceConfig config) {
        this.juiceRepository = juiceRepository;
        this.config = config;
    }
    public ResponseDTO<Juice> convertRequestToDTO(){
        ResponseDTO<Juice> res = new ResponseDTO<>();
        res.setOrderLaterEnabled(config.isOrderLaterEnabled());
        res.setStylesheet(config.getStylesheet());
        res.setMenuItems(juiceRepository.findAll());
        return res;
    }
}
