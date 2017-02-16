/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edcg.simple.springboot.webapp.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author edgar
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.edcg.simple.springboot.webapp")
public class SpringBootConfig {
    
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(SpringBootConfig.class)
                .run();
    }
    
}
