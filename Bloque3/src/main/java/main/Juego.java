/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.mycompany.bloque3.Perro;
import com.mycompany.bloque3.Pajaro;
import com.mycompany.bloque3.Pez;
import com.mycompany.bloque3.Tamagotchi;

/**
 *
 * @author nicoc
 */
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     System.out.println("Ejercicio 6");
        //variables internas hecha ejemplo
     Tamagotchi peta=new Perro("nico");
 Tamagotchi pruebapajaro=new Pajaro("fenix");
     Tamagotchi pruebapez=new Pez("Polo");
        System.out.println(peta);
       System.out.println(pruebapajaro);
       System.out.println(pruebapez);
        
        System.out.println("Ejercicio 7");
        //Preguntar porque no puedo hacer nico.nacer es por el static? tambien porque me devuelve null
        //si en el debuger esta bien
        Tamagotchi.nacer();
        
        System.out.println("Ejercicio8");
    }
    
}
