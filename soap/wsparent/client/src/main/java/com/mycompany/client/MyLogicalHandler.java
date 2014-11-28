/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.client;

import javax.xml.transform.Source;
import javax.xml.ws.LogicalMessage;
import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.handler.MessageContext;

/**
 *
 * @author L01
 */

//existuje i SOAPHandler
public class MyLogicalHandler implements LogicalHandler<LogicalMessageContext>{

    @Override
    public boolean handleMessage(LogicalMessageContext context) {
        LogicalMessage ms = context.getMessage();
        Source p = ms.getPayload();
        System.out.println();
        System.out.println("-----handleMessage-----");
        System.out.println(p);
        System.out.println(context.entrySet());
        System.out.println("-----/handleMessage-----");
        return true;
    }

    @Override
    public boolean handleFault(LogicalMessageContext context) {
        return true;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void close(MessageContext context) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
