/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.client;

import com.mycompany.service.Greeting;
import com.mycompany.service.GreetingImplService;

/**
 *
 * @author L01
 */
public class Main {
    public static void main(String[] args) {
        GreetingImplService gis = new GreetingImplService();
        Greeting p = gis.getGreetingImplPort();
        System.out.println(p.sayHello("šáša Váša"));
    }
}
