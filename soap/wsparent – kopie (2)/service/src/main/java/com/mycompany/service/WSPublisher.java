/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import javax.xml.ws.Endpoint;

/**
 *
 * @author L01
 */
public class WSPublisher {
    public static void main(String[] args){
        Endpoint.publish("http://localhost:8080/WS/Greeting", new GreetingImpl());
    }
    
}
