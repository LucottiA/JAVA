/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luco.java_egg_1;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class egg26 {

    /**
     RE AL PEDO ESTE EJERCICIO ADIOS
     */
    public static void main(String[] args) {
          int[] numeros = {0, -2, 4, 2, 0, 2, -4, -2, 0};
        System.out.println("Ingrese el orden de la matriz");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] matriz = new int[n][n];
        int[][] matrizT = new int[n][n];
        int contador = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.println("Ingrese la posicion: " + contador);
                matriz[i][j] = scan.nextInt();
                contador += 1;
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrizT[i][j] = matriz[j][i];
            }
        }
        contador = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(matriz[i][j] == -matrizT[i][j]) {
                    contador += 1;
                }
                
            }
        }
        
        System.out.println("La matriz:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("La matriz traspuesta:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrizT[i][j] + " ");
            }
            System.out.println("");
        }
        if(contador == pow(n, 2)) {
            System.out.println("Son matrices antisimetricas");
        } else {
            System.out.println("No son matrices antisimetricas");
        }
    }
}