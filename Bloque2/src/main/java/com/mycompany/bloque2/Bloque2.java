/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bloque2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *Clase principal del Bloque 2 de Ejercicios
 * @author nicolas Fernández Heredia
 */
public class Bloque2 {

    /**Relacion de Ejercicios del Bloque 2 de matrices
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int maximo = 100;
        int minimo = 0;
        int numeroAleatorio = aleatorio.nextInt((maximo - minimo) + 1) + minimo;
        byte filas;
        byte columnas;
        System.out.println("Dime cuantas filas quieres para matriz");
        filas = Byte.parseByte(sc.nextLine());
        System.out.println("Dime cuantas columnas quieres para la matriz");
        columnas = Byte.parseByte(sc.nextLine());

        int[][] matriz = new int[filas][columnas];

        int contadorFila = filas - 1;
        int contadorColumna = columnas - 1;
        int probando = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numeroAleatorio;
                numeroAleatorio = aleatorio.nextInt((maximo - minimo) + 1) + minimo;

            }
        }

        /* for (int k = 0; k <matriz.length-1; k++) {
                    for (int l = 0; l <matriz[k].length-1; l++) {
                        if (matriz[k][probando]==matriz[k][contadorColumna]) {
                            matriz[k][probando]=numeroAleatorio;
                            numeroAleatorio=aleatorio.nextInt((maximo-minimo)+1)+minimo;
                            contadorColumna--;
                        }else{
                            contadorColumna--;
                        }
                        
                   
                }
                    if (probando<=matriz[k].length-1) {
                probando++;
            }
                  if (contadorColumna==0) {
                            contadorColumna=columnas-1;
                        }
                  if (contadorFila>=0) {
                contadorFila--;
            }
                    }*/
        System.out.println("Ejercicio 4\n"+imprimeMatriz(matriz));

        System.out.println("Ejercicio5");
        int[][] bingo = new int[filas][columnas];
        //Cambiamos los valores de comprobacion a -1 porque los 0 no los coje
        int[][] comprobacion = new int[filas][columnas];
        for (int i = 0; i < comprobacion.length; i++) {
            for (int j = 0; j < comprobacion[i].length; j++) {
                comprobacion[i][j] = -1;
            }
        }
        //Copiamos los valores automaticamente de la matriz aleatorioa
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                bingo[i][j] = matriz[i][j];
            }
        }
        System.out.println("Tu carton es: \n" + imprimeMatriz(bingo));

        int aciertos = filas * columnas;

        System.out.println("Comenzamos a jugar aciertos restantes: " + aciertos);
        while (aciertos > 0) {
            numeroAleatorio = aleatorio.nextInt((maximo - minimo) + 1) + minimo;
            System.out.println("Sale el: " + numeroAleatorio);

            for (int u = 0; u < bingo.length; u++) {
                for (int k = 0; k < bingo[u].length; k++) {
                    //Empezamos a intentar probar numeros hasta que se hagan iguales

                    if (numeroAleatorio == bingo[u][k]) {

                        if (comprobacion[u][k] != bingo[u][k]) {
                            //No daba error en los repetidos sino en los 0 porque comparaba con la matriz comprobacino que tenia
                            //todo 0 y daba error. Solucionado pasandolo a -1
                            comprobacion[u][k] = bingo[u][k];
                            System.out.println("Tu comprobacion tiene\n" + imprimeMatriz(comprobacion));
                            aciertos--;
                        }

                        System.out.println("Quedan: " + aciertos);
                    }
                }

            }
        }
        System.out.println("Ejercicio6");

        String[][] saludos = {{"muchos", "ahora", "vez"}, {"la", "y capaces", "a"}, {"de trabajar mucho", "sois", "alumnos"}};
        String[][] ver = ordenarMatriz(saludos);
        System.out.println(imprimeMatriz(ver));

        System.out.println("Ejercicio 7");
        intercambiarValores(saludos, (byte) 0, (byte) 2, (byte) 2, (byte) 1);
        System.out.println(imprimeMatriz(saludos));
        //TO DO FALTA CREAR MATRIZ
        System.out.println("Ejercicio 8");
        String[][] descifrar = {{"yo quird!", "descifero", "passworar"}, {"techo", "mueño", "sungo"}};
        String[][] segundo = {{"vondo", "aproy a", "arrasabar"}, {"qui un", "teneriez", "dero"}};
        String resultado[][] = descifrarMatriz(segundo);
        System.out.println(imprimeMatriz(resultado));

        System.out.println("Ejercicio 9");
        String[][] cifrar = {{"yo quiero", "descifrar", "password!"}, {"tengo", "mucho", "sueño"}};
        String[][] capaz = cifrarMatriz(resultado);

        System.out.println(imprimeMatriz(capaz));

        System.out.println("Ejercicio 10");

        int[][] numeroMatriz = {{1, 2, 3, 4, 5, 6, 7}, {8, 9, 10, 11, 12, 13, 14}, {15, 16, 17, 18, 19, 20, 21}};

        System.out.println("La matriz original es:\n" + imprimeMatriz(numeroMatriz));
        
        System.out.println("Escribe cuantas filas quieres que se copien\n Se empieza desde 1");
        byte filasTeclado = Byte.parseByte(sc.nextLine());
        System.out.println("Escribe cuantas columnas quieres que se copien\n Se empieza desde 1");
        byte columnasTeclado = Byte.parseByte(sc.nextLine());
        System.out.println("Escribe a partir de que fila quiere que se cree la subMatriz\n Se empieza desde 0");
        byte filaOrigenTeclado = Byte.parseByte(sc.nextLine());
        

        System.out.println("Escribe a partir de que columna quiere que se cree la subMatriz\n Se empieza desde 0");
        byte columnaOrigenTeclado = Byte.parseByte(sc.nextLine());
        int[][] m2 = subMatriz((byte) filasTeclado, (byte) columnasTeclado, numeroMatriz, (byte) filaOrigenTeclado, (byte) columnaOrigenTeclado);
        System.out.println("Nuestra subMatriz es esta: \n" + imprimeMatriz(m2));
        
        System.out.println("Ejercicio 11");
        String[][] piramide = {{"Dulces"}, {"Carnes", "Embutidos"}, {"Pescado", "Lácteros", "Huevos"}, {"Pasta", "Pan", "Patatas", "Harinas"}};
        System.out.println(imprimeMatriz(piramide));
        System.out.println(matrizCentrada(piramide));

        System.out.println("Ejercicio 12 ");
        byte filasImpar;
        byte columnasImpar;
        do {

            System.out.println("Dime un numero para las filas debe de ser impar");
            filasImpar = Byte.parseByte(sc.nextLine());
        } while (filasImpar % 2 == 0);
        do {
            System.out.println("Dime un numero para las columnas debe de ser impar");
            columnasImpar = Byte.parseByte(sc.nextLine());
        } while (columnasImpar % 2 == 0);

        char[][] rebota = new char[filasImpar][columnasImpar];

        //System.out.println(filasImpar/2);
        //Creamos las bolitas en el medio
        for (int i = 0; i < rebota.length; i++) {
            for (int j = 0; j < rebota[i].length; j++) {
                if (j == filasImpar / 2) {
                    rebota[i][j] = '0';
                } else {
                    rebota[i][j] = '-';
                }
            }

        }

        System.out.println(imprimeMatriz(rebota));

        byte contador = 0;
        byte contadorDerecho = 2;
        char aux;
        char aux2;
        int distanciaACentro = 0;

        boolean direccion = true;

        int cuenta = filasImpar / 2;
        int centroCero = filasImpar / 2 + distanciaACentro;
        int centroUno = filasImpar / 2 + distanciaACentro + 1;

        for (int i = 0; i < 50; i++) {

            for (int j = 0; j < rebota.length; j++) {
                //Me lo imprime dos veces porque direccion no se pone a false lo hace pero cuando llega al primer if se vuelve
                //a poner en false no se por que

                //!SOLUCION el booleano no volvia a true
                //He usado contador y basicamente se volvera a true cuando haga una iteracion entera es decir cuando ruede 2 veces 
                //multiplicar la distancia del centro *2 así volverá a true, y no se imprimirá tantas veces.
                if (distanciaACentro == filasImpar / 2) {
                    direccion = false;
                    distanciaACentro = distanciaACentro * -1;
                }
                if (contador == cuenta * 2) {
                    direccion = true;
                    contador = 0;
                }
                //Para los pares
                if (j % 2 == 0) {

                    if (direccion == true) {
                        intercambio(rebota, j, filasImpar / 2 + distanciaACentro, j, filasImpar / 2 + distanciaACentro + 1);

                    } else {
                        intercambio(rebota, j, filasImpar / 2 - distanciaACentro - 1, j, filasImpar / 2 - distanciaACentro);
                    }

                }
                if (j % 2 != 0) {
                    if (direccion == true) {
                        intercambio(rebota, j, filasImpar / 2 - distanciaACentro, j, filasImpar / 2 - distanciaACentro - 1);
                    } else {
                        intercambio(rebota, j, filasImpar / 2 + distanciaACentro, j, filasImpar / 2 + distanciaACentro + 1);

                    }

                }
                if (j == rebota.length - 1) {
                    distanciaACentro++;
                    contador++;
                }

            }
            System.out.println(imprimeMatriz(rebota));
        }
    }

    /**
     * Funcion que sirve para imprimir matriz mediante un sout concatenando un
     * String
     *
     * @param orig matriz a la cual vamos a imprimir
     * @return Nos devuelve un String concatenado por las posiciones de la
     * matriz
     */
    public static String imprimeMatriz(int[][] orig) {
        if (orig == null) {
            return null;
        }
        String res = "";
        for (int i = 0; i < orig.length; i++) {
            for (int j = 0; j < orig[i].length; j++) {
                res += orig[i][j] + "|";
            }
            res += "\n";
        }
        return res;
    }

    /**
     * Funcion para intercambiar posiciones en una matriz
     *
     * @param orig matriz a la cual queremos intercambiar las posciciones
     * @param f1 posicion de fila a la cual vamos a acceder y cambiaremos por f2
     * @param f2 posicion de fila a la cual cambiaremos a f1
     * @param c1 posicion de columna a la cual vamos a acceder y cambiaremos por
     * la c2
     * @param c2 posicion de columna la cual cambiaremos por la c1
     */
    public static void intercambiarValores(String[][] orig, byte f1, byte f2, byte c1, byte c2) {
        String aux = orig[f1][c1];
        orig[f1][c1] = orig[f2][c2];
        orig[f2][c2] = aux;
    }

    /**
     * Funcion para ordenar una matriz de menor a mayor por el numero de letras
     * de String
     *
     * @param orig matriz a la cual vamos a ordenar
     * @return una matriz ordenada de menor a mayor
     */
    public static String[][] ordenarMatriz(String[][] orig) {
        //Pasamos la matriz a String pero antes cogemos la longitud de fila y columa de dicha matriz
        int fiG = 0;
        int coluP = 0;
        for (int i = 0; i < orig.length; i++) {
            for (int j = 0; j < orig[i].length; j++) {
                fiG = orig.length;
                coluP = orig[i].length;
            }
        }
        //Creamos un array en el cual ordenaremos todo
        String[] comprobacion = new String[fiG * coluP];
        //Creamos un String para poder pasarlo luego al array
        String cadena = Arrays.deepToString(orig);
        //Reemplazamos caracteres que no queremos
        cadena = cadena.replace("[", "").replace("]", "");
        comprobacion = cadena.split(", ");//Convertido a array
        //Vamos a ordenar el array en funcion del numero de letras para ello usaremos dos for uno coge toda la longitud
        //otro va comparando al siguiente con una variable auxiliar hacemos el cambio de posiciones en caso de que sea mas 
        //grande
        for (int i = 0; i < comprobacion.length - 1; i++) {
            for (int j = i + 1; j < comprobacion.length; j++) {
                if (comprobacion[i].length() > comprobacion[j].length()) {

                    String temp = comprobacion[i];

                    comprobacion[i] = comprobacion[j];

                    comprobacion[j] = temp;

                }

            }

        }
        int contador = 0;
        //Pasamos el array ordenado a una matriz
        for (int i = 0; i < orig.length; i++) {
            for (int j = 0; j < orig[i].length; j++) {

                orig[i][j] = comprobacion[contador];
                contador++;

            }
        }
        return orig;
    }

    /**
     * Imprime matriz por Pantalla
     *
     * @param orig matriz a la cual queremos imprimir
     * @return String concatenando cada posicion de matriz
     */
    public static String imprimeMatriz(String[][] orig) {
        String res = "";
        for (int i = 0; i < orig.length; i++) {
            for (int j = 0; j < orig[i].length; j++) {
                res += orig[i][j] + "|";
            }
            res += "\n";
        }
        return res;
    }

   

    /**
     * Imprime matriz por Pantalla
     *
     * @param orig matriz a la cual queremos imprimir
     * @return Char concatenando cada posicion de matriz
     */
    public static String imprimeMatriz(char[][] orig) {
        String res = "";
        for (int i = 0; i < orig.length; i++) {
            for (int j = 0; j < orig[i].length; j++) {
                res += orig[i][j] + "|";
            }
            res += "\n";
        }
        return res;
    }

    public static String[][] descifrarMatriz(String[][] orig) {
        if (orig == null) {
            return null;
        }
        //Creamos matriz 2X3 donde guardaremos todas las palabras sin las 3 ultimas letras
        String[][] comprobacion = new String[2][3];
        //Aqui guardaremos las tres ultimas letras de cada palabra
        String[][] ultimasLetras = new String[2][3];
        String aux;         //auxiliar de letra
        String aux2;  //auxiliar de las tres ultimas letras
        int contadorFinal = 0;//contador de 0

        //Metemos en un array comrpobacion los nombres sin las 3 ultimas y otro con las 3 ultimas letras
        for (int i = 0; i < orig.length; i++) {
            for (int j = 0; j < orig[i].length; j++) {
                aux = orig[i][j].substring(orig[i][j].length() - 3, orig[i][j].length());
                aux2 = orig[i][j].substring(0, orig[i][j].length() - 3);
                comprobacion[i][j] = aux2;
                ultimasLetras[i][j] = aux;
            }
        }
        //En otro for vamos a ir comparando dos opciones si i ==0 hacemos vamos añadiendo a comprobacion las ultimaletras
        //j+1 pero en el caso de que j este en la ultima fila coja el 0 para hacer el cambio de letras
        //si i == 1 hacemos el inverso
        for (int i = 0; i < orig.length; i++) {
            for (int j = 0; j < orig[i].length; j++) {
                if (i == 1) {
                    if (j == orig[i].length - 1 && i == 1) {
                        comprobacion[i][0] += ultimasLetras[i][j];

                    } else {
                        comprobacion[i][j + 1] += ultimasLetras[i][j];
                    }
                }

                if (i == 0) {
                    if (j == orig[i].length - 1 && i == 0) {
                        comprobacion[i][j] += ultimasLetras[i][contadorFinal];
                    } else {
                        comprobacion[i][j] += ultimasLetras[i][j + 1];
                    }
                }

            }
        }
        return comprobacion;
    }

    public static String[][] cifrarMatriz(String[][] orig) {
        if (orig == null) {
            return null;
        }
        //Creamos la matriz comprobacion
        //Creamos la matriz ultimas letras
        String[][] comprobacion = new String[2][3];
        String[][] ultimasLetras = new String[2][3];
        String aux;         //auxiliar de letra
        String aux2;  //auxiliar de las tres ultimas letras
        int contadorFinal = 0;//contador de 0
        //añadimos las tres ultiams letras a una matriz y el texto sin las tres ultimas letras a otra
        for (int i = 0; i < orig.length; i++) {
            for (int j = 0; j < orig[i].length; j++) {
                ultimasLetras[i][j] = orig[i][j].substring(orig[i][j].length() - 3, orig[i][j].length());
                comprobacion[i][j] = orig[i][j].substring(0, orig[i][j].length() - 3);

            }
        }

        //Creamos el algoritmo para cifrar las letras
        for (int i = 0; i < orig.length; i++) {
            for (int j = 0; j < orig[i].length; j++) {
                if (i == 1) {
                    if (j == orig[i].length - 1 && i == 1) {
                        comprobacion[i][j] += ultimasLetras[i][0];

                    } else {
                        comprobacion[i][j] += ultimasLetras[i][j + 1];
                    }
                }

                if (i == 0) {
                    if (j == orig[i].length - 1 && i == 0) {
                        comprobacion[i][0] += ultimasLetras[i][j];
                    } else {
                        comprobacion[i][j + 1] += ultimasLetras[i][j];
                    }
                }

            }
        }
        return comprobacion;
    }

    /**
     * Coge una submatriz a partir de la posición 0,0 de la matriz original y la
     * devuelve Prerequisito: la matriz orig tiene que ser cuadrada o
     * rectangular
     *
     * @param filas cuántas filas queremos que se copien empieza desde 1
     * @param columnas cuántas columnas queremos que se copien empieza desde 1
     * @param orig matriz original a partir de la que se construye la submatriz
     * @param filaOrigen indicamos a partir de que fila comenzamos a crear la
     * subMatriz empieza desde 0
     * @param columnaOrigen indicamos a partir de que columna comenzamo a crear
     * la subMatriz empieza desde 0
     * @return matriz subconjunto de la original, de tamaño indicado por filas y
     * columnas, a partir de que fila y columna se va a crear . Devuelve null si
     * el tamaño pedido por filas+filasOrifen o columnas+ColumnaOrigen es más
     * grande que el tamaño de orig
     *///(2,4,matriz,0,5)
    public static int[][] subMatriz(byte filas, byte columnas, int[][] orig, byte filaOrigen, byte columnaOrigen) {
        if (filas + filaOrigen > orig.length || columnas + columnaOrigen > orig[0].length) {
            return null;
        }
        int aux = columnaOrigen;
        int aux2 = filaOrigen;
        int contaColumna = 1;
        int contaFila = 1;
        //Declaro matriz a devolver del tamaño introducido
        int[][] ret = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            if (i > 0) {
                filaOrigen++;
            }
            for (int j = 0; j < columnas; j++) {
                ret[i][j] = orig[filaOrigen][columnaOrigen];

                if (contaColumna < columnas) {
                    columnaOrigen++;
                    contaColumna++;
                } else {
                    contaColumna = 0;
                    columnaOrigen = (byte) aux;
                }

            }
        }

        return ret;
    }

    /**
     * Funcion para imprimir una matriz centrada en forma piramide
     *
     * @param orig la matriz a la cual vamos a centrar
     * @return String centrado
     */
    public static String matrizCentrada(String[][] orig) {
        String aux = " ";
        String res = "";
        for (int i = 0; i < orig.length; i++) {
            for (int j = 0; j < orig[i].length; j++) {

                switch (i) {
                    case 0:
                        res += "          " + orig[i][j];
                        break;
                    case 1:

                        if (j == 0) {
                            res += "    ";
                        }
                        res += " " + orig[i][j];
                        break;
                    case 2:
                        res += " " + orig[i][j];
                        break;
                    case 3:
                        res += orig[i][j] + " ";
                        break;
                }
            }
            res += "\n";
        }
        return res;
    }

    /**
     *
     * @param matriz Matriz a la cual vamos a intercambiar
     * @param f1 fila donde queremos cojer el numero y cambiarla por la segunda
     * @param c1 columna de la matriz donde cambiaremos a la segunda columna
     * @param f2 fila segunda donde se cambiara a la fila 1
     * @param c2 columna segunda.
     */
    public static void intercambio(char[][] matriz, int f1, int c1, int f2, int c2) {
        char aux = matriz[f1][c1];
        matriz[f1][c1] = matriz[f2][c2];
        matriz[f2][c2] = aux;

    }

}
