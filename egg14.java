/* COPIADISIMO SORRY
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
solicite números al usuario hasta que la suma de los números introducidos supere 
el límite inicial. 
 */
package luco.java_egg_1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class egg14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        double suma = 0;
        System.out.println("Ingrese el limite de la suma");
        double limite = scan.nextDouble();
        System.out.println("Ingrese un numero");
        double numero = scan.nextDouble();
        suma += numero;
        if(numero > limite) {
            while(numero > limite) {
                System.out.println("Por favor indique un numero menor al limite: " + limite);
                numero = scan.nextDouble();
            }
        } else {
            if(suma >= limite) {
                System.out.println("La suma es: " + suma);
            } else {
                while(suma < limite) {
                    System.out.println("Por favor indique otro numero");
                    numero = scan.nextDouble();
                    suma += numero;
                }
            }
        }
        System.out.println("La suma total es: " + suma);
        scan.close();
    }
}