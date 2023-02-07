package com.example.profilemanager.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
@Profile("burger-delv")
@Getter
@Setter
@Configuration
@RefreshScope
public class BurgersConfig {
    @Value("${burgers.orderLater.enabled}")
    private boolean orderLaterEnabled;
    @Value("${burgers.styles.name}")
    private String stylesheet;
}
