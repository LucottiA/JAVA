/*
 ME LO RE COPIE SORRY YO 
 */
package luco.java_egg_1;

import java.util.Scanner;

public class egg15 {

     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        double suma;
        double resta;
        double multiplicacion;
        double division;
        String salir;
        System.out.println("Ingrese el primer numero");
        double numero1 = scan.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double numero2 = scan.nextDouble();
        int operacion = 0;
        do {
            if(operacion == 5) {
                System.out.println("Desea salir del programa? Ingrese S o N");
                salir = scan.next();
                
                if(salir.equals("S")) {
                    System.out.println("Finalizado");
                    break;
                }
                if(salir.equals("N")) {
                    System.out.println("MENU");
                    System.out.println("1. Sumar");
                    System.out.println("2. Restar");
                    System.out.println("3. Multiplicar");
                    System.out.println("4. Dividir");
                    System.out.println("5. Salir");
                    System.out.println("Elija opcion:");
                    operacion = scan.nextInt();
                }
            } else {
                if(operacion == 1) {
                    suma(suma = 0, numero1, numero2);
                }
                if(operacion == 2) {
                    resta = numero1 - numero2;
                    System.out.println("La resta de los numeros es: " + resta);
                }
                if(operacion == 3) {
                    multiplicacion = numero1 * numero2;
                    System.out.println("La multiplicacion de los numeros es: " + multiplicacion);
                }
                if(operacion == 4) {
                    if(numero2 == 0) {
                        System.out.println("No se puede realizar la division, el segundo numero es 0");
                    } else {
                        division = numero1 / numero2;
                        System.out.println("La division de los numeros es: " + division);
                    }
                }
                System.out.println("MENU");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");
                System.out.println("Elija opcion:");
                operacion = scan.nextInt();
            }
            
        } while(operacion >= 1 && operacion <= 5);
        
        
        if(operacion > 5 || operacion < 1) {
            System.out.println("Escribio un valor invalido");
        }
        scan.close();
    }
    
}