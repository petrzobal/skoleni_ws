/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rservice;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author L01
 */
public class MyResourceConfig extends ResourceConfig{
    
    public MyResourceConfig(){
        super(RSHelloWorld.class);
        register(new LoggingFilter());
    }
}
