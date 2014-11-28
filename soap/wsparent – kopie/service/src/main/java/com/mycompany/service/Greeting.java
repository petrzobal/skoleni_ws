/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import javax.jws.WebService;

/**
 *
 * @author L01
 */
@WebService
public interface Greeting {
    String sayHello(String name);
}
