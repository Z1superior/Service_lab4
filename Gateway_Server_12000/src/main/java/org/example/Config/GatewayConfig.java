package org.example.Config;

import org.example.filter.AuthFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.filter.GlobalFilter;


@Configuration
public class GatewayConfig {

    @Bean
    public GlobalFilter authFilter() {
        return new AuthFilter();
    }

}
