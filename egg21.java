/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luco.java_egg_1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class egg21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String moneda;
        double cantidadEurosAConvertir;
        double convertido = 0; //defino e inicio variables
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros a convertir");
        cantidadEurosAConvertir = scan.nextDouble(); //leer dinero
        System.out.println("Ingrese la moneda a la cual desea convertir(yenes, libras, dolares)");
        moneda = scan.next(); 
        if(moneda.equals("yenes")) { //si ingresan esto hace esto ja
            convertido = cantidadEurosAConvertir * 129.852;
        }
        if(moneda.equals("dolares")) {
            convertido = cantidadEurosAConvertir * 1.28611;
        }
        if(moneda.equals("libras")) {
            convertido = cantidadEurosAConvertir * 0.86;
        }
        if(!moneda.equals("yenes") && !moneda.equals("dolares") && !moneda.equals("libras")) { //el ! sera negativo?
            System.out.println("Ingreso una moneda invalida");
        } else {// si coincide la moneda te tira el resultado final
            System.out.println("La cantidad de euros " + cantidadEurosAConvertir + " en " + moneda + " son: " + convertido);
        }
    }
}