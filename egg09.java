/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: 
investigar la función equals() en Java
 */
package luco.java_egg_1;

import java.util.Scanner;

public class egg09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese eureka o es re gil");
        String frase = sc.nextLine();
        if(frase.equals("eureka")) { //funcar funca pero no toma mayusculas
        System.out.println("correcto");
        } else if (frase.equals("Eureka")) { //AHORA SI WACHO
           System.out.println("coshecto");
        } else if (frase.equals("EUREKA")) {
           System.out.println("coshecto pero re sacado wacho");
        } else {
           System.out.println("gil");
        }
        
    }
    
}
