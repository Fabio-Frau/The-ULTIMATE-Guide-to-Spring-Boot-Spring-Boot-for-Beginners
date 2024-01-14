package com.fabiofrau.PizzaApp.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties(prefix = "pizza")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PizzaConfig {

    private String sauce;
    private String topping;
    private String crust;

}
