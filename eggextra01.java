/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luco.java_egg_extras;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class eggextra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en minutos");
        int minutos = scan.nextInt();
        int horas = (int) Math.floor(minutos / 60); //math.floor redondea al numero anterior , paso minutos a hora
        int dias = horas / 24; //horas a dias
        if(horas >= 24) { //mayor o igual? 
            horas -= 24; //resta horas 24 
            dias += 1; //suma un dia
        } //mmm no entiendo como es para cuando son muchos dias?
        System.out.println("El tiempo ingresado de " + minutos + " minutos en dias y horas es: " + dias + " dias y " + horas + " horas.");
    }
}