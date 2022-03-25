package luco.java_egg_1;

import java.util.Scanner;

/*
Implementar un programa que dado dos números enteros determine cuál es el 
mayor y lo muestre por pantalla
 */

public class egg07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese primer numero");
        int num1 = sc.nextInt();
         System.out.println("ingrese segundo numero");
        int num2 = sc.nextInt();
        
        if (num1>num2) {
            System.out.println(num1 + " es mayor que " + num2);            
        } else {
             System.out.println(num2 + " es mayor que " + num1);  
        }
    
    }
    
}
