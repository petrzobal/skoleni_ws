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
public class Point3D extends Point {
    private int y;
    private int z;
    
    public Point3D(){
    }
    
    public Point3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
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

    /**
     * @return the z
     */
    public int getZ() {
        return z;
    }

    /**
     * @param z the z to set
     */
    public void setZ(int z) {
        this.z = z;
    }
    
    
}
