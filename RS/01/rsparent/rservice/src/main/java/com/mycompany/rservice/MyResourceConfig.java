/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rservice;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

/**
 *
 * @author L01
 */
public class MyResourceConfig extends ResourceConfig{
    
    public MyResourceConfig(){
        super(RSHelloWorld.class, MyInterceptor.class);
        register(new LoggingFilter());
        property(ServerProperties.PROVIDER_PACKAGES,  new String[] {"com.mycompany.rservice"});
    }
}
