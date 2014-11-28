/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jaxbhellw;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author L01
 */
@XmlRootElement(name="mypoint")
@XmlSeeAlso({Point2D.class, Point3D.class})
public class Point {
    protected int x;

    public Point() {
    }
    
    public Point(int x) {
        this.x = x;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }
    
}
