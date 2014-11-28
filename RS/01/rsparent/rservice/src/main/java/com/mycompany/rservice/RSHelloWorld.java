/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author L01
 */
@Path("hello")
public class RSHelloWorld {
    
    @GET
    String sayHello(){
        return "Hello";
    }
}
