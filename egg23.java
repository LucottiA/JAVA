/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luco.java_egg_1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class egg23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        int contador = 0;
        System.out.println("Ingrese la cantidad de numeros a generar");
        int n = scan.nextInt(); //le pido al usuario que defina el tamaño
        System.out.println("Ingrese numero a buscar");
        int numero = scan.nextInt(); //que ingrese el numero que quiere
        int[] vector = new int[n]; //creo el vector? con [n] 
        for(int i = 0; i < n; i++) { //para i =0 hasta n del vector
            vector[i] = (int) Math.floor(Math.random() * 10); //por cada vuelta poner un numero random que redondea con el floor? y lo multiplica por 10 para que sea del 0 al 10 sino es 0 a 1 una cosa asi we
            if(vector[i] == numero) {
                contador += 1; // suma uno si el numero buscado aparece
            }
        }
        String[] posiciones = new String[contador];
        contador = 0;
        for(int i = 0; i < n; i++) {
            if(vector[i] == numero) {
                posiciones[contador] = Integer.toString(i); //creo que aca saca cual es la posicion de numero buscado y la convierte a cadena?
                contador += 1;
            }
        }
        System.out.println("Se repite " + contador + " veces"); //imprime lo que encontro
        System.out.println(Arrays.toString(posiciones));
        
    }
}