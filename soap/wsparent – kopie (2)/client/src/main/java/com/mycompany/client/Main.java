/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.client;

import com.mycompany.service.GreetingImpl;
import com.mycompany.service.GreetingImplService;

/**
 *
 * @author L01
 */
public class Main {
    public static void main(String[] args) {
        System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
        GreetingImplService gis = new GreetingImplService();
        GreetingImpl p = gis.getGreetingImplPort();
        CoupleUtil cu = new CoupleUtil(p.sayHello("šáša Váša", "levák Bob"));
        System.out.println(cu);
    }
}
