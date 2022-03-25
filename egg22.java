/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luco.java_egg_1;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class egg22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0;
        int[] vector = new int[100];
        for(int i = 0; i < 100; i++) {
            vector[i] = contador;
            contador += 1;
        }
        System.out.print(Arrays.toString(vector));
    }   //creo que este esta mal, no se para que son los arrays 
        //y tampoco muestra los numeros descendentes onda del 100 al 0, la pia dice que seria i=99; i>=0; i-- o i=i-=1 ? (resta uno)
}