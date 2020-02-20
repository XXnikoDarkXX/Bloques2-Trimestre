/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repasoprimertrimestre;

import java.util.Random;
import java.util.Scanner;

/**
 *Esta es la clase principal de los Ejercicios de Repaso 
 * @author nicoc
 */
public class RepasoPrimerTrimestre {

    /**Main principal el cual llamamos a todas las funciones
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int tamañoArgumento=-1;//Preguntar que es lo que pasa necesito por fuerza declarala
        byte comprobando=0;
        char letraArgumento=' ';
        for (int i = 0; i < args.length; i++) {
            
            if (args[i].equals("-tam")||args[i].equals("-tamaño")) {
                System.out.println("pasndo por argumento");
                tamañoArgumento=Integer.parseInt(args[i+1]);
                System.out.println(tamañoArgumento);
            }
            if (args[i].equals("-letra")) {
               comprobando=1;
                letraArgumento=args[i+1].charAt(0);
            }
        }
        // TODO code application logic here

       
       
        int numeroGuardado;
        String nombre[] = {"pepe", "antonio","antonia", "hola", "juanito", "Guardiola", "Cintia","hola","Eustaquio","Mortadelo","Fidelon"
        +"esustaqiui","Bienvenido","fepe","Hoja","Papa","Habichuela","hortaliza","pan","freak","helado","yerba","cola","david"};
 int numeroMaximo = nombre.length;

       
         System.out.println("Ejercicio 1\nLos nombres son: "+imprimeArray(nombre));
        String[] arrayGuardado;
        System.out.println("Ejercicio2");
      do {
          
            numeroGuardado = pideNumeroPositivo(numeroMaximo,tamañoArgumento);
           if (tamañoArgumento==-1) {
               arrayGuardado= subArray(numeroGuardado, nombre);
          }else{
               numeroGuardado=tamañoArgumento;
               arrayGuardado= subArray(tamañoArgumento, nombre);
           }
         
        } while (numeroGuardado > nombre.length);
        System.out.println("IMPORTANTE!!! Debes de poner una letra de aqui: "+imprimeArray(arrayGuardado ));
        System.out.println("Dime una letra debe de ser de la a hasta la z");
        char hey=pideLetra(comprobando,letraArgumento);
        empiezaPor(hey,nombre);
        
        
        System.out.println("Ejercicio 9: \n"+imprimeArray(nombre ));
        System.out.println("Parte del ejercicio 10 :)");
        String[]arrayEmpieza=empiezaPor(hey,arrayGuardado);
        if(arrayEmpieza!=null){
            System.out.println(imprimeArray(arrayEmpieza));
        }
        
        //Cd
        
        
         int[] numeroArray={2,11,4,5,6,7,8,9,21,12,14,15,71,22,24,91,66,77,74,90,98,55,87,32};
       
        int masGrande = 0;
        int mayorQue = -1;
        int actual = 0;
        int[] destino = new int[numeroArray.length];
         
   byte opcion;
   do{
        System.out.println("Ejercicio 13 Tiene dos versiones\n\t1- Version Aleatorio\n\t2- Version harcodeada\n\t3- Salir");
        opcion=Byte.parseByte(sc.nextLine());
        
        
        switch(opcion){
            case 1:
                
        int numero;
        byte j = 0;
        int[] arrayNumero;
        byte min = 0;
        byte max = 10;
        int maxGrande = 0;
        int maxQue = -1;
        int act = 0;
        int vecesRepetidoActual=0;
        Random aleatorio = new Random();
        System.out.println("Dime un numero");
        numero = Byte.parseByte(sc.nextLine());
        int[] destin = new int[numero];
        arrayNumero = new int[numero];

        for (int i = 0; i < arrayNumero.length; i++) {
            int numeroAleatorio = aleatorio.nextInt((max - min) + 1) + min;
            arrayNumero[i] = numeroAleatorio;
        }
        System.out.println(imprimeArray(arrayNumero));
        //busca el mas grande
        for (int k = 0; k < arrayNumero.length; k++) {
            if (arrayNumero[k] > maxGrande) {
                maxGrande = arrayNumero[k];
            }
        }
        act=maxGrande;

     
        for (int i = 0; i < arrayNumero.length; i++) {
            for (int k = 0; k < arrayNumero.length; k++) {
                if (arrayNumero[k] < act && arrayNumero[k] > maxQue) {
                    act = arrayNumero[k];
                    vecesRepetidoActual=0;
                    for (int l = 0; l<arrayNumero.length; l++) {
                        if(arrayNumero[l]==act){
                            vecesRepetidoActual++;
                        }
                    }
                }

            }
            for (int k = 0; k < vecesRepetidoActual&&(i+k)<destin.length; k++) {
                destin[i+k] = act;
            }
            i=i+vecesRepetidoActual-1;
            maxQue = act;
            act = maxGrande;

        }
      
        System.out.println(imprimeArray(destin));
        break;
            case 2:
                
               System.out.println(imprimeArray(numeroArray));
        for (int k = 0; k < numeroArray.length; k++) {
            if (numeroArray[k] > masGrande) {
                masGrande = numeroArray[k];
            }
        }
        actual=masGrande;

        for (int i = 0; i < numeroArray.length; i++) {
            for (int k = 0; k < numeroArray.length; k++) {
                if (numeroArray[k] < actual && numeroArray[k] > mayorQue) {
                    actual = numeroArray[k];

                    }
                }
            destino[i]=actual;
              mayorQue = actual;
            actual = masGrande;
            }
            
          
  System.out.println(imprimeArray(destino)); 
  break;
            case 3: 
                System.out.println("Saliste");
                break;
                
            default:
                System.out.println("Te equivocaste ahgg");
                break;
            }    
                
    
     
        }while(opcion!=3);
   
   
   //
        System.out.println("Ejercicio 14 Así lo conseguí yo!!! ");
    char []desplazado=new char[10];
        char aux0=' ';
        char aux1=' ';
        char aux2=' ';
        char aux3=' ';
        char aux4=' ';
        char aux5=' ';
        char aux6=' ';
        char aux7=' ';
        char aux8=' ';
        char aux9=' ';
      // byte contador=8;
       byte original=9;
       byte contaTexto=0;
                String texto = "Mira como mola esto, una marquesina";
          for (int i = 0; i < desplazado.length-1; i++) {
           
              for (int j = 0; j < desplazado.length-1; j++) {
    
               desplazado[9]=texto.charAt(contaTexto);
               
             
                  if (original>0) {
                    original--;  
                  }
                   
             System.out.println(desplazado);   
                       aux9=desplazado[9];
                       aux8=desplazado[8]; 
                       aux7=desplazado[7];
                       aux6=desplazado[6];
                       aux5=desplazado[5]; 
                       aux4=desplazado[4];
                       aux3=desplazado[3];
                       aux2=desplazado[2];
                       aux1=desplazado[1];
                       aux0=desplazado[0];
                       
                   for (int k = 0; k < 1; k++) {
                 desplazado[9]=aux0;
                 desplazado[8]=aux9;            
                 desplazado[7]=aux8;
                desplazado[6]=aux7;
                desplazado[5]=aux6;
                  desplazado[4]=aux5;
                    desplazado[3]=aux4;
                    desplazado[2]=aux3;
                    desplazado[1]=aux2;
                    desplazado[0]=aux1;
                  }
                    
                   if (contaTexto<34) {
                      contaTexto++;
                  }else{
                       i=desplazado.length-1;
                   }
                   
           
              }
       original=9;
     }
   
   
        
        
    }
/**
 * Funcion que pide numero Postivos o los coje del argumento, debe ser menor al maximo
 * @param maximo maximo numero que no puedes exceder
 * @param cambio sirve para los argumentos si encuentra un valor mauor al 0 cogera el numero por argumentos
 * @return nos devuelve el numero positivo
 */
    public static int pideNumeroPositivo(int maximo,int cambio) {
        Scanner sca = new Scanner(System.in);
        int numeroPedido;
        if (cambio==-1) {
             do {
            System.out.println("Dime un numero asegurate que sea menor que " + maximo);
            numeroPedido = Integer.parseInt(sca.nextLine());

        } while (numeroPedido <= 0 || numeroPedido >= maximo);
             return numeroPedido;
        }else{
            numeroPedido=cambio;
        }
    
        return numeroPedido;
         
    }
/**
 * Funcion donde coje aleatoriamente nombres de un array segun el tamaño indicado y el array de nombres propuesto
 * @param tamaño tamaño que va a tener el array
 * @param orig array original que contiene los nombres
 * @return un array con nombres aleatorios
 */
    public static String[] subArray(int tamaño, String[] orig) {
          //TO DO el único que yo sepa que no he conseguido funcionar es el ejercicio4
        Scanner sca = new Scanner(System.in);
        int maximo = 22;
        int minimo = 0;

        Random aleatorio = new Random();
        int valorDado = aleatorio.nextInt((maximo - minimo) + 1) + minimo;
        //aleatorio.nextInt(1)+1;
        if (tamaño > orig.length) {
            return null;
        } else if (tamaño <= orig.length) {
            String res[] = new String[tamaño];
            for (int i = 0; i < res.length; i++) { 
                  res[i] = orig[valorDado];
                  valorDado = aleatorio.nextInt((maximo - minimo) + 1) + minimo;;
                for (int j = 0; j < i; j++) {
                     
                    
                   if (res[j] == res[i])  {
                       //valorDado = aleatorio.nextInt((maximo - minimo) + 1) + minimo;;
                        res[i] = orig[valorDado];
                    } 
                        
                    

                }
            }
               //to do Revisar simplemente para ver array guardado para que no se repitan los nombres 
            for (int j = 0; j < res.length; j++) {
                System.out.println(res[j]);
            }
            return res;
        }
        return orig;
    }
    /**
     * Funcion que pida letra por teclado o cogiendo letra del argumento
     * @param comprobando Sirve para revisar si hay alguna letra en los argumentos
     * @param letraArgumento Sirve para devolver la letra que haya en el argumento si lo hay;
     * @return nos devuelve o una letra pedida por teclado o nos coge directamente del argumento
     */
public static char pideLetra(byte comprobando,char letraArgumento){
    Scanner sca=new Scanner (System.in);
    
     char letra;
    if (comprobando==0) {
        do{
        
           letra=sca.nextLine().charAt(0);
        }while((int)letra<65||(int)letra>90&&(int)letra<97||(int)letra>122&&(int)letra!='ñ'&&(int)letra!='Ñ');
       String letraChica=Character.toString(letra);
       
       letraChica= letraChica.toLowerCase();
        letra=letraChica.charAt(0);
       
    }else{
        return letraArgumento;
    }
   
       
        
   return letra; 
   //to do Lo he conseguido a base de golpes preguntar un poco al maestro
}
/**
 * 
 * Funcion nos busca los nombres por la iniciales de la letra pedida de antes si no encuentra nada devuelve null
 * @param buscada letra de la funcion anterior pedida
 * @param orig array con los nombres
 * @return array con nombres ajustados por la letra inicial o nada
 */
public static String[] empiezaPor(char buscada,String []orig){
    
    Scanner sc=new Scanner (System.in);
    String [] arrayRelleno;
    
    
    String letraBuscada=Character.toString(buscada);
    int capacidad=0;
    
    for (int i = 0; i < orig.length; i++) {
        //to do hacer variable con if para que si no encuentra ninguna palabra que el valor de null
        if (orig[i].toLowerCase().startsWith(letraBuscada)) {
           
            //TO DO PREGUNTAR POR QUE NO VALE CAPACIDAD++ con capacidad hacer cada iteracion y luego cuando 
            //tengamos el tamaño pasarlo a un array y pasar los nombres
             capacidad++;
               }
     
        }
    byte contador=0;
       arrayRelleno=new String[capacidad];
        for (int j = 0; j <orig.length; j++) {
            if (orig[j].toLowerCase().startsWith(letraBuscada)) {
               arrayRelleno[contador]=orig[j];  
               contador++;
            }
           
        }
        
    if (capacidad==0) {
            return null;
        }
    return arrayRelleno;
}
/**
 * Funcion para imprimir array
 * @param orig array al cual vamos a imprimir
 * @return  devuelve el array concatenada todas las posiciones
 */
public static String imprimeArray(String[] orig){
        String res="";
        for (int i = 0; i < orig.length-1; i++) {
            res+=orig[i]+" | ";
        }
        return res+orig[orig.length-1];
    }
/**
 * Funcion para imprimir array
 * @param orig array al cual vamos a imprimir
 * @return  devuelve el array concatenada todas las posiciones
 */
public static String imprimeArray(int[] orig){
    String hola="";
    for (int i = 0; i < orig.length-1; i++) {
        hola+=orig[i]+" | ";
    }
    return hola+orig[orig.length-1];
}

}

