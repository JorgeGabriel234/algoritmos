package com.isil.pe;

public class DeclaracionMatriz {

    public static void main(String[] args){
        int[][] numerosEnteros = new int[2][3];
        System.out.println("Filas: " + numerosEnteros.length);
        System.out.println("Columnas " + numerosEnteros[0].length);
        System.out.println("Contenido inicial");

        for(int fila=0; fila < numerosEnteros.length; fila++){
            for(int columna = 0; columna< numerosEnteros[fila].length; fila++){
                System.out.print(numerosEnteros[fila][columna] + "");
            }
            System.out.println();
        }
    }
}
