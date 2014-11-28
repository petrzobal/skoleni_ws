/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rservice;

import java.io.IOException;
import java.util.logging.Logger;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.WriterInterceptor;
import javax.ws.rs.ext.WriterInterceptorContext;

/**
 *
 * @author L01
 */
@Provider
public class MyInterceptor implements WriterInterceptor {

    static Logger l = Logger.getAnonymousLogger();
    
    @Override
    public void aroundWriteTo(WriterInterceptorContext wic) throws IOException, WebApplicationException {
        l.info("MyInterceptor starts");
        wic.proceed();
        l.info("MyInterceptor ends");
    }
    
    
}
