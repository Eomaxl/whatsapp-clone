package com.eomaxl.whatsapp.configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

public class AppConfig {
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return http.build();
    }
}
