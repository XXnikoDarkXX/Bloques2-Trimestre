/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bloque3;

/**
 *
 * @author nicoc
 */
public class Bloque3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fecha actual=new Fecha();
        actual.dia=23;
        actual.mes=1;
        actual.año=1987;
        System.out.println(actual);
        System.out.println(actual.esValida(actual));
       /* Fecha hola=new Fecha();
        hola.año=1880;
        hola.dia=12;
        hola.mes=4;
        System.out.println(actual);
      */
    }
   
}
