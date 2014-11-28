/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.client;

import com.mycompany.service.GreetingImplService;
import java.io.IOException;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Response;
import javax.xml.ws.Service;
import javax.xml.ws.handler.Handler;

/**
 *
 * @author L01
 */
public class Main {

    public static void main(String[] args) throws TransformerConfigurationException, TransformerException, SOAPException, IOException {
        System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
        GreetingImplService gis = new GreetingImplService();
        /*
         Dispatch<Source> d = gis.createDispatch(new QName("http://service.mycompany.com/", "GreetingImplPort"), 
         Source.class, 
         Service.Mode.PAYLOAD);
         String requestPaylod = "<ns2:sayHello xmlns:ns2=\"http://service.mycompany.com/\"><name1>šáša</name1><name2>Váša</name2></ns2:sayHello>";
        
         //pri Service.Mode.MESSAGE - posilani cele zpravy
         //String requestMesage = "<?xml version=\"1.0\" ?><S:Envelope xmlns:S=\"http://schemas.xmlsoap.org/soap/envelope/\"><S:Body><ns2:sayHello xmlns:ns2=\"http://service.mycompany.com/\"><name1>ĹˇĂˇĹˇa</name1><name2>VĂˇĹˇa</name2></ns2:sayHello></S:Body></S:Envelope>";
        
         Source result = d.invoke(new StreamSource(new StringReader(requestPaylod)));
         */

        Dispatch<SOAPMessage> d = gis.createDispatch(new QName("http://service.mycompany.com/", "GreetingImplPort"),
                SOAPMessage.class,
                Service.Mode.MESSAGE);
        
        ((BindingProvider)d).getBinding().
                setHandlerChain(Collections.<Handler>singletonList(new MyLogicalHandler()));

        ((BindingProvider)d).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "test_user");
                
        MessageFactory mf = MessageFactory.newInstance();
        SOAPMessage sm = mf.createMessage();

        //lepsi vytvaret prvky pres factory
        /*SOAPFactory sf = SOAPFactory.newInstance();
         sf.createElement(null);*/
        sm.getSOAPBody().addBodyElement(new QName("http://service.mycompany.com/", "sayHello"));
        sm.writeTo(System.out);

        //SOAPMessage result = d.invoke(sm);
        d.invokeAsync(sm, new AsyncHandler<SOAPMessage>() {

            @Override
            public void handleResponse(Response<SOAPMessage> res) {
                try {
                    SOAPMessage sm = res.get();
                    sm.writeTo(System.out);
                    System.exit(0);
                } catch (Exception ex) {
                    System.out.println("exception");
                    //Logger.
                }
                
                //System.out.println("return from invokeAsync");

            }
        });
        for (;;) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("sleeping");
                }

        //result.writeTo(System.out);
        /*
         //pro formatovany vystup
         TransformerFactory tf = TransformerFactory.newInstance();
         Transformer t = tf.newTransformer();
         t.transform(result, new StreamResult(System.out));
         */
        /*GreetingImpl p = gis.getGreetingImplPort();
         CoupleUtil cu = new CoupleUtil(p.sayHello("šáša Váša", "levák Bob"));
         System.out.println(cu);*/
    }
}
