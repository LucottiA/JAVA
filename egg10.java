/*
 Realizar un programa que solo permita introducir solo frases o palabras de 8 de 
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir 
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java
 */
package luco.java_egg_1;

import java.util.Scanner;

public class egg10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese palabra de ocho letras");
        String palabra = sc.nextLine();
        if (palabra.length()==8) { //LENGHT HT NO TH LPM
            System.out.println("correctoo");
        } else {
            System.out.println("no boludo");
        }
    }
    
}
