package luco.java_egg_1;

import java.util.Scanner;

/*
 Escriba un programa que pida una frase o palabra y valide si la primera letra de esa 
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por 
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir 
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
public class egg11 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("ingrese palabra o frase que empiece por A");
        String palabra = sc.nextLine();
        String letra = palabra.substring(0,1); //0,1 marcar donde empezar y terminar---- char daba problemas mmm
        if (letra.toUpperCase().equals("A")) { //upper case para que lo tome bien aunque este en minuscula
            System.out.println("correctoo");
        } else {
            System.out.println("no boludo");
        }
    }
    
}
