/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rservice;

import javax.ws.rs.ext.RuntimeDelegate;
import org.glassfish.grizzly.http.server.HttpHandler;

/**
 *
 * @author L01
 */
public class Main {
    
    public static void main(String[] args) {
        HttpHandler endpoint = RuntimeDelegate.getInstance().
                createEndpoint(new HelloWorldApp(), MyHandler.class);
    }
}
