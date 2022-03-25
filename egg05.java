/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package luco.java_egg_1;

import java.util.Scanner;

public class egg05 {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese grados celsius");
        int grados = sc.nextInt();
        int F = 32 + (9 * grados / 5); //int para que sea una variable de tipo entero pero tendria que ser double=real
        System.out.println("En farehdeukjgieojnkvgd  es = " + F); 
        
    }
    
}
