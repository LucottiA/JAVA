/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla 
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
Math.sqrt().
 */
package luco.java_egg_1;

import java.util.Scanner;

public class egg06 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("ingrese numero entero wacho");
        int num = sc.nextInt();
        System.out.println("num: " + num + "\n al cuadrado: " + (Math.sqrt(num)) + "\n por 2: " +(num*2) + "\n por 3: " + (num*3));
        //"\n" hace salto de linea  o puedo poner sout varias veces para cada linea
    }
    
}
