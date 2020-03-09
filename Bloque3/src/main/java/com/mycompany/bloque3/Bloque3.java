/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bloque3;

import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class Bloque3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        // TODO code application logic here
        
        
        Fecha actual=new Fecha((byte)31,(byte)4, 222);
        
        //TO DO Preguntar el ejercicio 3 eso de crear metodo de instancia revisar clase Fecha pues no puedo usar
        //la funcion del auxiliar creado en el metodo  Mayorque (esta comentado el codigo)
        
        System.out.println(actual);
        System.out.println(actual.esValida(actual));
        //TO DO PREGUNTAR ESO DE MAYOR O IGUAL O MAYOR EN LA CLASE FECHA Y SI HAY QUE QUITAR EL TRUE
       System.out.println("Parte 4");
        System.out.println("Vamos a crear dos fechas");
        System.out.println("Dime el dia de la fecha1");
        byte dia=Byte.parseByte(sc.nextLine());
        System.out.println("Dime el mes de la fecha1");
        byte mes=Byte.parseByte(sc.nextLine());
        System.out.println("Dime el año de la fecha1");
        int año=Integer.parseInt(sc.nextLine());
        Fecha poco1=new Fecha(dia,mes,año);
        
        System.out.println("Dime el dia de la fecha2");
        dia=Byte.parseByte(sc.nextLine());
        System.out.println("Dime el mes de la fecha2");
        mes=Byte.parseByte(sc.nextLine());
        System.out.println("Dime el año de la fecha2");
        año=Integer.parseInt(sc.nextLine());
        Fecha poco2=new Fecha(dia,mes,año);
        
        System.out.println("La fecha primera es "+poco1);
        System.out.println("La fecha segunda es "+poco2);
        System.out.println(((String)(poco1.mayorQue(poco2)?"La primera es mayor":"La segunda es mayor o igual")));
       
    }


}
