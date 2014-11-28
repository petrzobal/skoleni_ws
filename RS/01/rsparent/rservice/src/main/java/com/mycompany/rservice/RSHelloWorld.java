/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rservice;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

/**
 *
 * @author L01
 */
@Path("hello")
public class RSHelloWorld {
    
    @GET
    public String sayHello() { //@Context ServletContext context){
        //return context.getServerInfo();
        return "Hello";
    }
}
