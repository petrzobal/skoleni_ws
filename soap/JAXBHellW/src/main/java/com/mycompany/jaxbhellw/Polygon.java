/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jaxbhellw;

/**
 *
 * @author L01
 */
public class Polygon {
    private Point pl;
    private Point p2;
    
    public Polygon(){
        this.pl = new Point2D(1,2);
        this.p2 = new Point3D(1,2,3);
    }

    /**
     * @return the pl
     */
    public Point getPl() {
        return pl;
    }

    /**
     * @param pl the pl to set
     */
    public void setPl(Point pl) {
        this.pl = pl;
    }

    /**
     * @return the p2
     */
    public Point getP2() {
        return p2;
    }

    /**
     * @param p2 the p2 to set
     */
    public void setP2(Point p2) {
        this.p2 = p2;
    }
    
    
    
}
