/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

/**
 *
 * @author L01
 */
public class Couple {
    private String name1;
    private String name2;
    
    public Couple() {
    }

    public Couple(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }

    @Override
    public String toString() {
        return "Couple{" + "name1=" + name1 + ", name2=" + name2 + '}';
    }
    

    /**
     * @return the name1
     */
    public String getName1() {
        return name1;
    }

    /**
     * @param name1 the name1 to set
     */
    public void setName1(String name1) {
        this.name1 = name1;
    }

    /**
     * @return the name2
     */
    public String getName2() {
        return name2;
    }

    /**
     * @param name2 the name2 to set
     */
    public void setName2(String name2) {
        this.name2 = name2;
    }
    
    
    
}
