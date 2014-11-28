/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jaxbhellw;

import com.mycompany.ObjectFactory;
import com.mycompany.PersonType;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import org.xml.sax.SAXException;


/**
 *
 * @author L01
 */
public class Main {
    
    public static void main(String[] args) throws JAXBException, SAXException {
        ObjectFactory of = new ObjectFactory();
        PersonType person = of.createPersonType();
        person.setName("sasa Vasa(šáša Váša)");
        JAXBElement<PersonType> ep = of.createPerson(person);
        JAXBContext c = JAXBContext.newInstance("com.mycompany");
        Marshaller m = c.createMarshaller();
        
        //validace pri marshalizaci - pokud nenastavím jméno(setName), tak vyhodí chybu
        SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema s = sf.newSchema(Main.class.getResource("/helloWorldXMLSchema.xsd"));
        m.setSchema(s);
        m.setEventHandler(new ValidationEventHandler() {
            @Override
            public boolean handleEvent(ValidationEvent event) {
                System.out.println(event);
                return true;
            }
        });
        
        m.setProperty("jaxb.formatted.output", true);
        m.marshal(ep, System.out);
    }
    
}
