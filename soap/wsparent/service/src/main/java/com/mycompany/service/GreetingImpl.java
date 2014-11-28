/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.jws.HandlerChain;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import static javax.jws.soap.SOAPBinding.Style.RPC;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

/**
 *
 * @author L01
 */
@WebService
@HandlerChain(file = "/handlerchain.xml")
@SOAPBinding//(style = RPC)
public class GreetingImpl {
    
    //@Resource
    //MessageContext context;
    
    public String sayHello() {
        //kdyz na klientovi nastavi usera, tak si ho tady muzu precist
        //Object user = context.get(BindingProvider.USERNAME_PROPERTY);
        try {
            Thread.sleep(3000);// i ty prase
        } catch (InterruptedException ex) {
            Logger.getLogger(GreetingImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

                
        return "Hi";
    }

    /*
    public String  sayHello(@WebParam(name = "name1") String name1, @WebParam(name = "name2") String name2) {
        return "Hi, " + name1 + " and " + name2;
    }
    */
    
    /*
    public Couple sayHello(@WebParam(name = "name1") String name1, @WebParam(name = "name2") String name2) {
        Couple c = new Couple(name1, name2);
        return c;
    }
    */
}
