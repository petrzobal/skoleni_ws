/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rsclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import org.glassfish.jersey.filter.LoggingFilter;

/**
 *
 * @author L01
 */
public class Main {
    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        
        client.register(new LoggingFilter());
        
        String responseEntity = client
                          .target("http://localhost:9998")
                          .path("hello")
                          .request().get(String.class);
        System.out.print(responseEntity);
    }
}
