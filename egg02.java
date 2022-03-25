package luco.java_egg_1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class egg02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("ingresa numero");
       int numero1 = scan.nextInt();
        System.out.println("ingresa segundo numero");
        int numero2 = scan.nextInt();
      int suma = numero1 + numero2;
        System.out.println("la suma de " + numero1 + " y " + numero2 + " es igual a " + suma);
    }


        }
    
  


