/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial3_progra3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Manuel Cueto
 */
public class Apoyo {
    public static void leer(ArrayList<Relevo> ar) throws IOException{
        Scanner en = new Scanner(new File("Competencia.txt"));
        Relevo obj;
        String equipo;
        int seg;
        int mseg;
        while(en.hasNextLine()){
            equipo = en.next();
            Tiempo fourt[] = new Tiempo[4];
            for (int i = 0; i < fourt.length; i++) {
               seg = en.nextInt();
               mseg = en.nextInt();
               fourt[i] = new Tiempo(seg, mseg);   
            }
            obj = new Relevo(equipo,fourt);
            ar.add(obj);
        }   
    }
    public static void mostrarAr(ArrayList<Relevo> ar){
        System.out.println(" EQUIPO       T1       T2       T3       T4       TF");
        System.out.println("---------   -------  -------  -------  -------  -------");
        for (int i = 0; i < ar.size(); i++) {
            ar.get(i).mostrar();
            
        }
    
    }
    public static void ganador(ArrayList<Relevo> ar){
        int menor = ar.get(0).getTotal_mseg_4();
        String gana = "";
        for (int i = 0; i < ar.size(); i++) {
            if(menor > ar.get(i).getTotal_mseg_4()){
                menor = ar.get(i).getTotal_mseg_4();
                gana = ar.get(i).getEquipo();
            }
            
        }
        System.out.println("El ganador es: " + gana);
    }
}
