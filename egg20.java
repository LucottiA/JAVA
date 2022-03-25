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
public class egg20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        String cadena;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 4; i++) { // para ingresar las filas (4 en total), incremento
            System.out.println("Ingrese un numero");
            numero = scan.nextInt();
            while (numero > 20) { //si el numero es mayor a 20 te tira esto
                System.out.println("Escriba un numero menor o igual a 20");
                numero = scan.nextInt();
            }
            cadena = ""; //defino variable
            for (int j = 0; j < numero; j++) { // repito hasta que j sea "numero" 
                cadena += "*"; //cada vuelta suma un *
            } //sale del bucle
            System.out.print(numero + " " + cadena); //imprime la cosa final
            System.out.println("");
        } // vuelve al primer for
    }
}
