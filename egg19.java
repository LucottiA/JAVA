/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luco.java_egg_1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class egg19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int n; //defino variable n
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la base");
        n = scan.nextInt(); //leo el valor de n por teclado
        for(int i = 0; i < n; i++) {  //(filas?) recorrer la matriz desde 0 hasta que el numero sea menor que n (en el video dicen de usar lenght matriz[0].lenght)
            for(int j = 0; j < n; j++) {  // lo mismo para las columnas
                if(i == 0 || i == n - 1) { // ||=or  no entiendo ahh mmmm osea si es la fila inicial o final hacer x:
                    System.out.print("*"); //si se cumple alguna te pone el *
                }                           //i++ y j++ es para ingrementar 1 paso
                if(i > 0 && i < n - 1) { //si la fila mayor a 0 y menor a n-1 no hace nada sino que te manda a la columna
                    if(j == 0 || j == n - 1) { // tomar solo columnas externas
                        System.out.print("*"); // si se cumple pone *
                    } else {
                        System.out.print(" "); // sino se cumple nada de fila o columna te pone el espacio vacio
                    }
                }
            }
            System.out.println(""); //salto de linea? creo
        }
    }
}