package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
@Configuration
public class AppConfig {

	@Bean
	public 	BCryptPasswordEncoder pwdEncoder() {
		return new BCryptPasswordEncoder();
	}
}
