/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import java.io.IOException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

/**
 *
 * @author L01
 */
public class ServerHandler implements SOAPHandler<SOAPMessageContext>{

    @Override
    public Set<QName> getHeaders() {
        System.out.print("***");
        System.out.println(getClass());
        return null;
        //return true;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        System.out.print("***");
        System.out.println(getClass());
        try {
            SOAPMessage mess = context.getMessage();
            mess.writeTo(System.out);
        } catch (SOAPException ex) {
            Logger.getLogger(ServerHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ServerHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        System.out.print("***");
        System.out.println(getClass());
        return true;
    }

    @Override
    public void close(MessageContext context) {
        System.out.print("***");
        System.out.println(getClass());
    }


}
