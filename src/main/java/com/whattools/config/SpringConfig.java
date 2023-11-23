package com.whattools.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.whattools.service","com.whattools.mapper"})
@EnableWebMvc
public class SpringConfig {
}
