package com.example.profilemanager.controllers;

import com.example.profilemanager.dto.ResponseDTO;
import com.example.profilemanager.models.Juice;
import com.example.profilemanager.services.JuiceService;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("juice-delv")
@RequestMapping("juices")
public class JuicesEndpoint {
    private final JuiceService juiceService;

    public JuicesEndpoint(JuiceService juiceService) {
        this.juiceService = juiceService;
    }

    @GetMapping("/getData")
    public ResponseDTO<Juice> getJuiceData() {
        return juiceService.convertRequestToDTO();
    }


}
