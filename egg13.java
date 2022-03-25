/*
  Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
la nota se pedirá de nuevo hasta que la nota sea correcta. 
 */
package luco.java_egg_1;

import java.util.Scanner;

public class egg13 {


    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int nota;
        do{
            System.out.println("Ingrese una nota");
            nota = scan.nextInt();
        } while(nota < 0 || nota > 10);
        System.out.println("La nota es: " + nota);
        scan.close();
        /* el mio no funco jejeje
        Scanner sc = new Scanner(System.in);
       
        int nota; // separado 
          System.out.println("ingrese su nota");
        
        nota = sc.nextInt();
        if (nota=>1 && nota=<10) {
            System.out.println("NOTA CORRECTA. SU NOTA ES: " + nota);
        } else {
        do {            
             System.out.println("nota incorrecta, ingrese nota");
         
        nota = sc.nextInt();
        } while (nota>=10);
         }
        System.out.println("NOTA CORRECTA. SU NOTA ES: " + nota");
        */
        
        
    }
    
}
