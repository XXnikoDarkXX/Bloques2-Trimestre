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
  private byte dia;//dia de la fecha
   private byte mes;//mes de la fecha
    private int año;//año de la fecha
    
/**
 * Constructor de fecha con todos sus parametros
 * @param d dia de la fecha
 * @param m mes de la fecha
 * @param a año de la fecha
 */
  public Fecha(byte d,byte m,int a){
      this.dia=d;
      this.mes=m;
      this.año=a;
  }
  

  
    @Override
    public String toString() {
        return "la fecha es: "+dia+"/" +mes+"/" + año;
        
    }
   public boolean esValida(Fecha Actual){
      
       if (this.getMes()==2&&dia>28) {
           return false;
       }//Buscar calendario 2019 y terminarlo debemos hacer que sea desde el 0 hasta el 31 para los días igual para los meses
       if ((mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)&&dia>31) {
           return false;
       }
       if ((mes==4||mes==6||mes==9||mes==11) &&dia>=31) {
           return false;
       }
       if (mes<=0||mes>12) {
           return false;
       }
       return true;
   }
  
 
   public boolean mayorQue(Fecha orig){
       
      
       //TO DO voy a crear otro parametro pues el fecha aux me da bastantes problemas this.
       if ((orig.getDia()<this.getDia()||orig.getMes()<this.getMes())||orig.getAño()<this.getAño()) {
           return true;
       }
       
       return false;
   }
/**
 * Getter de Dia
 * @return el dia de la fecha
 */
    public int getDia() {
        return dia;
    }
/**
 * Getter del mes
 * @return Devuelve el mes de la fecha
 */
    public int getMes() {
        return mes;
    }
/**
 * Getter del año
 * @return nos devuelve el año
 */
    public int getAño() {
        return año;
    }
/**
 * Setter del dia
 * @param dia dia al que queremos cambiar
 */
    public void setDia(byte dia) {
        this.dia = dia;
    }
/**
 * Setter del mes
 * @param mes mes al cual queremos cambiar
 */
    public void setMes(byte mes) {
        this.mes = mes;
    }
/**
 * Setter del año
 * @param año año al cual queremos cambiar
 */
    public void setAño(int año) {
        this.año = año;
    }
   
   
   

   
}
