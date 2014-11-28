/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import javax.jws.WebService;

/**
 *
 * @author L01
 */
@WebService(endpointInterface = "com.mycompany.service.Greeting")
public class GreetingImpl implements Greeting{

    @Override
    public String sayHello(String name) {
        return "Hi, " + name;
    }
    
}
