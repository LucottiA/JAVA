/*
Crear un programa que dado un numero determine si es par o impar.
 */
package luco.java_egg_1;

import java.util.Scanner;

public class egg08 {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("ingrese numero");
        int num1 = sc.nextInt();
     
        
        if (num1%2==0) {
            System.out.println(num1 + " es par");            
        } else {
             System.out.println(num1 + " es impar");  
    }
    
}
