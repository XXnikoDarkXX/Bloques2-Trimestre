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
public class  Pez extends Tamagotchi {
/**
 * Constructor de Pez con todos los campos
 * @param nombre del pez
 * @param hambre del pez
 * @param sueño del pez
 * @param higiene del pez
 * @param diversion del pez
 */
    public Pez(String nombre, byte hambre, byte sueño, byte higiene, byte diversion) {
        super(nombre, hambre, sueño, higiene, diversion);
    }
  /**
   * Constructor de Pez con solo nombre y sus variables internas a 100
   * @param nombre nombre del pez
   */
   public Pez(String nombre){
       super(nombre);
   }

    
    public String toString() {
      String aux="";
       aux+=this.getNombre()+" - Pez\n";
        aux+="---------------------\n";
        aux+="Hambre - "+this.getHambre();
        aux+="\nSueño - "+this.getSueño();
        aux+="\nHigiene - "+this.getHigiene();
        aux+="\nDiversión - "+this.getDiversion();
     
        return aux;
                
    }
  
       
    }
 

