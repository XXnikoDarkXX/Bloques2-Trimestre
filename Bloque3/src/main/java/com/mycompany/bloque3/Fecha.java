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
public class Fecha {
    int dia;
    int mes;
    int año;

    @Override
    public String toString() {
        return "la fecha es: "+dia+"/" +mes+"/" + año;
    }
   public boolean esValida(Fecha Actual){
       if (this.mes==2&&dia>28) {
           return false;
       }//Buscar calendario 2019 y terminarlo debemos hacer que sea desde el 0 hasta el 31 para los días igual para los meses
       if ((mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)&&dia>31) {
           return false;
       }
       if ((mes==4||mes==6||mes==9||mes==11) &&dia>31) {
           return false;
       }
       if (mes<=0||mes>12) {
           return false;
       }
       return true;
   }

   
}
