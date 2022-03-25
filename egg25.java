/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luco.java_egg_1;

/**
 *
 * @author Usuario
 */
public class egg25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int [][] matriz = new int[4][4]; //matriz de 4x4 [][]
        for(int i = 0; i < 4; i++) { //del 0 a 4-1 para fila
            for(int j = 0; j < 4; j++) {//same pero para columnas
                matriz[i][j] = (int) Math.floor(Math.random() * 10); //rellena con numeros enteros aleatorios
            }
        }
        System.out.println("La matriz:");
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " "); //imprime la matriz resultante [i][j]
            }
            System.out.println(""); // salto de linea we
        }
        System.out.println("La matriz traspuesta:");
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print("["+matriz[j][i]+"]"); //da vuelta: [j][i]
            } //con "[]" queda mas preciosa we
            System.out.println("");
        }
    }
}