/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial3_progra3;

/**
 *
 * @author Manuel Cueto
 */
public class Tiempo {
    private int seg;
    private int mseg;

    public Tiempo(int seg, int mseg) {
        this.seg = seg;
        this.mseg = mseg;
    }
    
    public int mili(){
        int total_mseg = seg*1000 + mseg;
        return total_mseg;
    }

    public int getSeg() {
        return seg;
    }

    public int getMseg() {
        return mseg;
    }
    
}
