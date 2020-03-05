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
public class Perro extends Tamagotchi {
   private byte paseo;//Indica entre 0 a 100 satisfaccion de pasearse
/**
 * Constructor de Perro con todos los campos
 * @param nombre del perro
 * @param hambre del perro
 * @param sueño del perro
 * @param higiene del perro
 * @param diversion del perro
 * @param pas del perro
 */    
public Perro(String nombre, byte hambre, byte sueño, byte higiene, byte diversion,byte pas) {
        super(nombre, hambre, sueño, higiene, diversion);
        this.paseo=pas;
}
/**
 * Constructor perro con variable interna a 100
 * @param nombre  nombre del perro
 */
public Perro(String nombre){
    super(nombre);
    this.paseo=100;
    
}


/**
 * Getter de Pasear
 * @return el paseo
 */
    public byte getPaseo() {
        return paseo;
    }
/**
 * Setter de paseo
 * @param paseo a cambiar
 */
    public void setPaseo(byte paseo) {
        this.paseo = paseo;
    }

    
    public String toString() {
        String aux="";
        
        
       
         aux+=this.getNombre()+" - Perro\n";
        aux+="---------------------\n";
        aux+="Hambre - "+this.getHambre();
        aux+="\nSueño - "+this.getSueño();
        aux+="\nHigiene - "+this.getHigiene();
        aux+="\nDiversión - "+this.getDiversion();
        aux+="\nPaseo "+this.paseo;
        return aux;
    }
    /**
     * Funcion para restar -5 a su variable interna al final de cada buecle del juego
     * @param orig Tamagotchi original
     */
   @Override
   public void vivir( ){
    super.vivir();
    this.setPaseo(paseo+=-5);
}
    
    /**
 * Funcion para saber si se ha muerto el tamagotchi esta sobreescribiendo otra funcion de su superclase
 * @return true si esta vivo false si esta muerto
 */
    @Override
    public boolean seHaMuerto(){
        if (super.seHaMuerto()==true||this.paseo==0) {
            return true;
        }
        return false;
    } 
    /**
     * Funcion para aumentar el nivel de paseo +15 al Perro
     */

    public void pasear(){
        this.paseo+=15;
    }
   
    
}
