/*
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */
package luco.java_egg_1;

import java.util.Scanner;

public class egg03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
  
        System.out.println("ingrese nombre pendejo");
         String nombre = sc.next(); //mmmm solo next sirve parece, asi no me complico con int, doble, string, chart
         System.out.println("su nombre es " + nombre);
    }
    
}
