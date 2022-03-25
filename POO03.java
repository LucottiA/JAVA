/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luco;

/**
 *
 * @author Usuario
 */
public class POO03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

POO03Operacion ope = new POO03Operacion(); //crear objeto
ope.crearOperacion(); // traer metodo para leer numeros 

ope.sumar();
        
ope.restar();

ope.multiplicar();

ope.dividir();

        System.out.println("Terminamos wacho");
        // TODO code application logic here
    }

    
}
