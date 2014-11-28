/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.client;

import com.mycompany.service.Couple;

/**
 *
 * @author L01
 */
public class CoupleUtil {
    Couple couple;

    public CoupleUtil(Couple couple) {
        this.couple = couple;
    }

    @Override
    public String toString() {
        return "Couple{" + "name1=" + couple.getName1() + ", name2=" + couple.getName2() + '}';
    }
    
    
}
