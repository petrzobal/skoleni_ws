/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rsclient;

import com.mycompany.rservice.Point;
import java.util.logging.Logger;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.glassfish.jersey.filter.LoggingFilter;

/**
 *
 * @author L01
 */
public class Main {
    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        
        client.register(new LoggingFilter(Logger.getAnonymousLogger(), true));
        
        Response responseEntity = client
                          .target("http://localhost:9998")
                          .path("hello")
                          .request(MediaType.APPLICATION_XML).get();
        System.out.print("Response: " + responseEntity.readEntity(Point.class));
    }
}
