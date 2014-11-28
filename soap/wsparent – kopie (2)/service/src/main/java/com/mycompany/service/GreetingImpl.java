/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import static javax.jws.soap.SOAPBinding.Style.RPC;

/**
 *
 * @author L01
 */
@WebService
@SOAPBinding(style = RPC)
public class GreetingImpl {

    public Couple sayHello(@WebParam(name = "name1") String name1, @WebParam(name = "name2") String name2) {
        Couple c = new Couple(name1, name2);
        return c;
        //return "Hi, " + name1 + " and " + name2;
    }
    
}
