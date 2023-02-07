package com.example.profilemanager.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
@Profile("juice-delv")
@Getter
@Setter
@Configuration
@RefreshScope
public class JuiceConfig {
    @Value("${juice.orderLater.enabled}")
    private boolean orderLaterEnabled;
    @Value("${juice.styles.name}")
    private String stylesheet;

}
