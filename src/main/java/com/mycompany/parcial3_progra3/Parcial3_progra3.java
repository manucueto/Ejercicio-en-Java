/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.parcial3_progra3;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Manuel Cueto
 */
public class Parcial3_progra3 {

    public static void main(String[] args) throws IOException {
        ArrayList<Relevo> ar = new ArrayList<Relevo>();
        Apoyo.leer(ar);
        Apoyo.mostrarAr(ar);
        Apoyo.ganador(ar);
    }
}
