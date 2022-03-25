/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luco;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class POO04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);//.useDelimiter("\n");
// el \n para que no haya un error donde me deja ingresar un solo dato
      POO04rectangulo rec = new POO04rectangulo(); // todo en uno  
System.out.print("Ingrese la Base: "); //ARREGLAR
        rec.setBase()=sc.nextInt();
        System.out.print("Ingrese la Altura: ");
        rec.setAltura()=sc.nextInt();

       

        //  rec.crearRectangulo(0, 0); mmm no corre bien
        System.out.println("La superficie: " + rec.superficie());
        System.out.println("El perimetro: " + rec.perimetro());

    }

}
