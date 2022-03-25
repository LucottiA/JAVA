/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
después toda en minúsculas. Nota: investigar la función toUpperCase() y 
toLowerCase() en Java
 */
package luco.java_egg_1;

import java.util.Scanner;

public class egg04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // system con mayuscula
        System.out.println("escriba una frase");
        String frase = sc.nextLine();
        //nextin solo me tomo un caracter, y probablemente una sola palabra, next line tomo todo
        System.out.println("su frase es: " + frase + ". En mayusculas: " + frase.toUpperCase());
        System.out.println("su frase es: " + frase + ". En minusculas: " + frase.toLowerCase());
    
///no anda wacho descarga el 8 :(
//al final si anduvo, tenia parentesis mal puestos 
//she dificil

    }
}
