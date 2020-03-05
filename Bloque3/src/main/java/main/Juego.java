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
import java.util.Scanner;

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
        Scanner sc=new Scanner (System.in);
     System.out.println("Ejercicio 6");
        //variables internas hecha ejemplo
     Tamagotchi peta=new Perro("nico");

        System.out.println(peta);
  
        
        System.out.println("Ejercicio 7");
        //Preguntar porque no puedo hacer nico.nacer es por el static? tambien porque me devuelve null
        //si en el debuger esta bien
       // Tamagotchi.nacer();
        System.out.println("Ejercicio 8");
        System.out.println("Revisar su tostring");
        
        System.out.println("Ejercicio9");
        System.out.println("");
         Tamagotchi pruebapajaro=new Pajaro("fenix");
     Tamagotchi pruebapez=new Pez("Polo");
          System.out.println(pruebapajaro);
          System.out.println();
       System.out.println(pruebapez);
        System.out.println("");
        System.out.println("Ejercicio 10");
        System.out.println("");
       Tamagotchi jugando=Tamagotchi.nacer();
       
      //  System.out.println(jugando.getClass().getName());
        System.out.println(jugando);
      byte opcion;
      do{
          
      /*
          //TO DO HACER jugando.getClass().getName() Y COPIAR lo que haya en la salida , ponerlo en el if y si es true
          6 - pasear
          si es false 6- volar
      */
        System.out.println("Bienvenido al Tamagotchi Estas en los años 90!!!!");
        System.out.println("Escribe una de las siguientes opciones\n\t0 - Salir\n\t1 - No hacer nada\n\t2 - Dar de comer"
                + "\n\t3 - Dormir\n\t4 - Bañar\n\t5 jugar"); 
        
      String comprobacion=  jugando.getClass().getName()=="com.mycompany.bloque3.Perro"?"\n\t6- Pasear2":"\n\t6 - Volar";
          System.out.println(comprobacion);
        
          opcion=Byte.parseByte(sc.nextLine());
          switch(opcion){
              case 0: 
                  System.out.println("Salistes!");
                  break;
              case 1:
                  System.out.println("No hicistes nada!");
                  break;
              case 2: 
                  System.out.println("!!Voy a alimentar a mi tamagotchi");
                  jugando.comer();
                  break;
              case 3: 
                  System.out.println("A dormir ya!!");
                  jugando.dormir();
                  break;
              case 4: 
                  System.out.println("Bañaaate!!");
                  jugando.bañarse();
                  break;
              case 5: 
                  System.out.println("Juguemos!!");
                  jugando.jugar();
                  break;
              case 6: 
                  System.out.println("Paseemos");
                  ((Perro)jugando).pasear();
                   
                  break;
              case 7: 
                  System.out.println("Volemos como un fenix!! ");
                  ((Pajaro)jugando).volar();
                  break;
              default:
                  System.out.println("Vaya que hicistes? pulsastes mala tecla vuelve a intentarlo!!!");
                  break;
          }
          jugando.vivir();
      
          System.out.println("Así está tu tamagotchi!!\n"+jugando);
          if (jugando.seHaMuerto()) {
              System.out.println("Tu tamagotchi se ha muerto");
              break;
          }
        }while(opcion!=0);
      
        
    
    }
    
}
