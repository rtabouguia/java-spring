/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.javaspring.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 *
 * @author RAISA
 */
@Component
@Profile("dev")
public class DevDataSourceConfig implements DataSourceConfig{
    
    @Override
    public void setup(){
        System.out.println("Setting up datasource for DEV environement");
    }
    
}
