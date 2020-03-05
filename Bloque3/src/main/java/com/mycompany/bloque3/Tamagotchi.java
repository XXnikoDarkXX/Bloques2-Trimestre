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
public abstract class Tamagotchi {

    private String nombre;//Nombre del tamagotchi
    private byte hambre;//Hambere del tamagotchi
    private byte sueño;//Sueño del tamagotchi
    private byte higiene;//Higiene del tamagotchi
    private byte diversion;//Divertsion del tamagothi

    public Tamagotchi() {

    }

    /**
     * Constructor de Tamagotchi con todos sus parametros
     *
     * @param nombre del tamagotchi
     * @param hambre del tamagotchi
     * @param sueño del tamagotchi
     * @param higiene del tamagotchi
     * @param diversion del tamagotchi
     */
    public Tamagotchi(String nombre, byte hambre, byte sueño, byte higiene, byte diversion) {
        this.nombre = nombre;
        this.hambre = hambre;
        this.sueño = sueño;
        this.higiene = higiene;
        this.diversion = diversion;
    }

    /**
     * Constructor con todas las variables internas por defecto a 100
     *
     * @param nombre del tamagotchi
     */
    public Tamagotchi(String nombre) {
        this.nombre = nombre;
        this.hambre = 100;
        this.sueño = 100;
        this.higiene = 100;
        this.diversion = 100;

    }

    /**
     * Getter del nombre
     *
     * @return el nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Getter del hambre
     *
     * @return hambre
     */
    public byte getHambre() {
        return hambre;
    }

    /**
     * Getter del sueño
     *
     * @return el sueño
     */
    public byte getSueño() {
        return sueño;
    }

    /**
     * Getter Higiene
     *
     * @return higiene
     */
    public byte getHigiene() {
        return higiene;
    }

    /**
     * Getter diversion
     *
     * @return diversion
     */
    public byte getDiversion() {
        return diversion;
    }

    /**
     * Setter del nombre
     *
     * @param nombre a cambiar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Setter del hambre
     *
     * @param hambre a cambiar
     */
    public void setHambre(byte hambre) {
        this.hambre = hambre;
    }

    /**
     * Setter del sueño
     *
     * @param sueño a cambiar
     */
    public void setSueño(byte sueño) {
        this.sueño = sueño;
    }

    /**
     * Setter higiene
     *
     * @param higiene a cambiar
     */
    public void setHigiene(byte higiene) {
        this.higiene = higiene;
    }

    /**
     * Setter de diversion
     *
     * @param diversion a cambiar
     */
    public void setDiversion(byte diversion) {
        this.diversion = diversion;
    }

    @Override
    public String toString() {
        String aux;
        aux = "Hambre - " + this.hambre;

        aux += "\nSueño - " + this.sueño;
        aux += "\nHigiene - " + this.higiene;
        aux += "\nDiversión - " + this.diversion;

        return aux;
    }

    public final static Tamagotchi nacer() {
        Scanner sca = new Scanner(System.in);
        Tamagotchi aux = null;
        String cual;
        String nombrecual;
        byte contador = 0;
        do {

            System.out.println("Dime una raza debe de ser Perro,Pajaro o Pez ");
            cual = sca.nextLine();
            System.out.println("Dime un nombre para la raza");
            nombrecual = sca.nextLine();
            switch (cual) {
                case "Perro":
                    contador = 1;
                    aux = new Perro(nombrecual);
                    break;
                case "Pajaro":
                    contador = 1;
                    aux = new Pajaro(nombrecual);
                    break;
                case "Pez":
                    contador = 1;
                    aux = new Pez(nombrecual);
                    break;
                default:
                    System.out.println("Te equivocaste de raza");
                    break;
            }

        } while (contador != 1);
        return aux;
    }

    /**
     * Funcion para que al final de cada bucle del juego se le reste 5 puntos a
     * todas las variables comunes de las razas
     *
     * @param orig Tamagotchi al cual le va a afectar
     */
    public void vivir() {
        this.setDiversion(diversion += -5);
        this.setSueño(sueño += -5);
        this.setHambre(hambre += -5);
        this.setHigiene(higiene += -5);
    }

    /**
     * Funcion para saber si ha muerto el tamagotchi cuando sus variables queden a 0
     * @return True si esta vivo, false si esta muerto
     */
    public boolean seHaMuerto() {
        if (this.diversion == 0 || this.hambre == 0 || this.higiene == 0 || this.sueño == 0) {
            return true;
        }
        return false;
    }
    /**
     * Funcion para dar de comer al tamagotchi aumenta 15 el nivel de hambre
     */
    public void comer(){
        this.hambre+=15;
    }
    /**
     * Funcion para dormir al Tamagotchi aumenta 15 el nivel del sueño
     */
    public void dormir(){
        this.sueño+=15;
    }   
    /**
     * Funcion para bañar al Tamagotchi aumenta 15 el nivel de higiene
     */
    public void bañarse(){
        this.higiene+=15;
    }
    /**
     * Funcion para jugar con el Tamagotchi aumenta 15 el nivel de diversion
     */
    public void jugar(){
        this.diversion+=15;
    }
}
