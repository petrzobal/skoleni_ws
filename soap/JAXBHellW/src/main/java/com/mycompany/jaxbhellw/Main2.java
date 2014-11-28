/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jaxbhellw;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBException;

/**
 *
 * @author L01
 */
public class Main2 {
    
    public static void main(String[] args) throws JAXBException {
        
        /*
        JAXBContext c = JAXBContext.newInstance(Point.class);
        Marshaller m = c.createMarshaller();
        Point2D p = new Point2D(1,2);
        m.setProperty("jaxb.formatted.output", true);
        m.marshal(p, System.out);
        */
        
        //marshalizace rovnou
        JAXB.marshal(new Polygon(), System.out);
    }
}
