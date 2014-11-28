/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rsclient;

import javax.ws.rs.client.ClientBuilder;

/**
 *
 * @author L01
 */
public class Main {
    public static void main(String[] args) {
        String responseEntity = ClientBuilder
                          .newClient()
                          .target("http://localhost:9998")
                          .path("hello")
                          .request().get(String.class);
        System.out.print(responseEntity);
    }
}
