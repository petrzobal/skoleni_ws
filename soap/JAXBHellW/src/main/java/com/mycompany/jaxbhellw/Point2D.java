/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jaxbhellw;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author L01
 */
//@XmlRootElement(name="mypoint")
@XmlRootElement
public class Point2D extends Point {
    private int y;
    
    public Point2D(){
    }
    
    public Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }


    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    
    
    
}
