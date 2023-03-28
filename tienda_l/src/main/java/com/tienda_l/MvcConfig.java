/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda_l;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author Laboratorios
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer{
    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry
                .addViewController("/")
                .setViewName("index")
                ;
        registry
                .addViewController("/index")
                .setViewName("index")
                ;
        registry
                .addViewController("/login")
                .setViewName("login")
                ;
        registry
                .addViewController("/erorres/403")
                .setViewName("/errores/403")
                ;
    }
}
