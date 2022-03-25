/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luco.java_egg_1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class egg24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int numero, uno, dos, tres, cuatro, cinco;
        uno = 0;
        dos = 0;
        tres = 0;
        cuatro = 0;
        cinco = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a generar");
        numero = scan.nextInt();
        int[] vector = new int[numero]; // creo el vector
        Random numeroAleatorio = new Random(); // funcion random importada 
        int digitos;
        for(int i = 0; i < numero; i++) { //rellenar el vectr?
            vector[i] = numeroAleatorio.nextInt(100000); //con numero aleatorio 100000
        }
        for(int i = 0; i < numero; i++) { // otro bucle para revisar el vector
            digitos = 1;
            int num = vector[i];
//            System.out.println("El numero del vector es: " + vector[i]);
            if(num / 10 < 1) { //nose
                digitos = 1;
                uno += 1;
//                System.out.println("Tiene un digito");
                break;
            }
            while(num / 10 >= 1) { //no entiendo el num/10 osea no podia poner como abajo digito==numero y listorti 
                digitos += 1;
                num = num / 10;
            }
            
            if(digitos == 2) {
                dos += 1;
//                System.out.println("Tiene 2 digitos");
            }
            if(digitos == 3) {
                tres += 1;
//                System.out.println("Tiene 3 digitos");
            }
            if(digitos == 4) {
                cuatro += 1;
//                System.out.println("Tiene 4 digitos");
            }
            if(digitos == 5) {
                cinco += 1;
//                System.out.println("Tiene 5 digitos");
            }
            
        }//gueno te imprime todo lo que encontro 
        System.out.println("Numeros con 1 digito: " + uno);
        System.out.println("Numeros con 2 digitos: " + dos);
        System.out.println("Numeros con 3 digitos: " + tres);
        System.out.println("Numeros con 4 digitos: " + cuatro);
        System.out.println("Numeros con 5 digitos: " + cinco);
    }
}