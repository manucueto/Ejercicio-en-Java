/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial3_progra3;

/**
 *
 * @author Manuel Cueto
 */
public class Relevo {
    private String equipo;
    private Tiempo fourt[]; 
    private int total_mseg_4;

    public Relevo(String equipo, Tiempo[] fourt) {
        this.equipo = equipo;
        this.fourt = fourt;
        total_mseg_4 = actualizar();
    }
    private int actualizar(){
        int act = 0;
        for (int i = 0; i < fourt.length; i++) {
            act += fourt[i].mili();
            
        }
        return act;
    }

    public String getEquipo() {
        return equipo;
    }

    public int getTotal_mseg_4() {
        return total_mseg_4;
    }
    
    public void mostrar(){
        System.out.printf("%-10s", equipo);
        for (int i = 0; i < fourt.length; i++) {
            System.out.printf("%4d %4d", fourt[i].getSeg(), fourt[i].getMseg() );
            
        }
        System.out.printf("%4d %4d\n", total_mseg_4/1000, total_mseg_4%1000);
            
        
    }
}
