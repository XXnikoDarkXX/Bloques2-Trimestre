/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bloque3;

import java.util.logging.Logger;

/**
 *
 * @author nicoc
 */
public class Pajaro extends Tamagotchi {

    private byte vuelo;//0 -100 necesidad de volar

    /**
     * Constructor con todos los campos de Pájaro
     *
     * @param nombre del pajaro
     * @param hambre del pajaro
     * @param sueño del pajaro
     * @param higiene del pajaro
     * @param diversion del pajaro
     * @param vu necesidad de volar del pajaro
     */
    public Pajaro(String nombre, byte hambre, byte sueño, byte higiene, byte diversion, byte vu) {
        super(nombre, hambre, sueño, higiene, diversion);
        this.vuelo = vu;
    }

    /**
     * Constructor de pajaro con todas sus variables internas a 100
     *
     * @param nombre del pajaro
     */
    public Pajaro(String nombre) {
        super(nombre);
        this.vuelo = 100;
    }

    /**
     * Getter de Vuelo
     *
     * @return vuelo
     */
    public byte getVuelo() {
        return vuelo;
    }

    /**
     * Setter del vuelo
     *
     * @param vuelo a modificar
     */
    public void setVuelo(byte vuelo) {
        this.vuelo = vuelo;
    }

    public String toString() {
        String aux = "";
        aux += this.getNombre() + " - Pajaro\n";
        aux += "---------------------\n";
        aux += "Hambre - " + this.getHambre();
        aux += "\nSueño - " + this.getSueño();
        aux += "\nHigiene - " + this.getHigiene();
        aux += "\nDiversión - " + this.getDiversion();
        aux += "\nVuelo " + this.vuelo;
        return aux;
    }

    /**
     * Funcion para restar -5 a su variable interna al final de cada bucle del
     * juego
     *
     * @param orig Tamagotchi al cual le va a afectar
     */

    @Override
    public void vivir() {
        //Atributos padre diversion, hambre, sueño
        super.vivir();
        this.setVuelo(vuelo += -5);
    }
/**
 * Funcion para saber si se ha muerto el tamagotchi esta sobreescribiendo otra funcion de su superclase
 * @return true si esta vivo false si esta muerto
 */
    @Override
    public boolean seHaMuerto(){
        if (super.seHaMuerto()==true||this.vuelo==0) {
            return true;
        }
        return false;
    } 
    /**
     * Funcion para sacar a volar a un pajaro aumenta +15 su nivel de vuelo
     */
   
    public void volar(){
       this.vuelo+=15;
    }
   
 
   
}
