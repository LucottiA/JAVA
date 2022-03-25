/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luco.java_egg_1;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class egg27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = {2, 7, 6, 9, 5, 1, 4, 3, 8}; //mmmm no se que esta pasando aca, declara variable? pero con []? seran los numeros permitidos?
        int contador = 0;
        int sumarFilas;
        int sumarColumnas;
        int diagonalP = 0;
        int diagonalS = 0; //declara otras giladas
        int[] sumaFilas = new int[3]; //mmmmmmmmmmmm mmmm
        int[] sumaColumnas = new int[3];
        int[] sumaDiagonales = new int[2];
        int[][] cuadrado = new int[3][3]; //matriz
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) { //recorrer la matriz
                if(numeros[contador] > 9 || numeros[contador] < 1) { //leo si los numeros van de 1 a 9 sino chau
                    System.out.println("Ingreso numeros invalidos"); 
                } else {
                    cuadrado[i][j] = numeros[contador];
                    contador += 1;
                }
            }
        }
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(cuadrado[i][j] + " ");
            }
            System.out.println(""); //imprime la matriz?
        }
        for(int i = 0; i < 3; i++) { // como es de tres por tres va del 0 al 2 osea 0,1,2 = 3 posiciones
            sumarFilas = 0;
            sumarColumnas = 0;
            for(int j = 0; j < 3; j++) {
                sumarFilas += cuadrado[i][j]; //+= era eso de añadirle o algo asi como para no poner i=i+a
                sumarColumnas += cuadrado[j][i]; // lo mismo con las columnas
                if(i + j == 2) {
                    diagonalS += cuadrado[i][j]; //mmmm ni idea
                }
            }
            diagonalP += cuadrado[i][i];
            sumaFilas[i] = sumarFilas;
            sumaColumnas[i] = sumarColumnas;
        }
        sumaDiagonales[0] = diagonalS;
        sumaDiagonales[1] += diagonalP; //mori morida
        contador = 0;
        for(int i = 0; i < 3; i++) {
            if(sumaFilas[i] == sumaColumnas[i] && sumaFilas[i] == sumaDiagonales[0] && sumaDiagonales[0] == sumaDiagonales[1]) {
                contador += 1; // si todo concuerda 
            }
        }
        if(contador == 3) { //hace esto
            System.out.println("Es un cuadrado magico");
        } else {//sino esto
            System.out.println("No es un cuadrado magico");
        }
        System.out.println(Arrays.toString(sumaDiagonales)); //mmmmm imprime pero porque array? 
        System.out.println(Arrays.toString(sumaFilas));
        System.out.println(Arrays.toString(sumaColumnas));
    }
}