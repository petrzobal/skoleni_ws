/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rservice;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author L01
 */
public class HelloWorldApp extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        return Collections.<Class<?>>singleton(RSHelloWorld.class);
    }
    
}
