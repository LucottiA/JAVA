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
public class POO01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Libro l1 = new Libro();
        //control apretar la clase te lleva a ese archivo
        //control shift c comentario

        
        //mmmm me falla por alguna razon del mostrar libro asi que las inicializo aca 
       //me falla si pongo esto tambien dio
       //no eran necesarias we
//        String isbn = "0";
//        String titulo = "aaa";
//        String autor = "aaa";
//        int pagina = 0;
        
        
//leer datos
        System.out.println("Ingrese autor del libro");
        l1.autor = sc.nextLine();
        System.out.println("Ingrese Titulo del libro");
        l1.titulo = sc.nextLine(); //next line por si es un titulo compuesto
        System.out.println("Ingrese ISBN del libro");
        l1.isbn = sc.next();
        System.out.println("Ingrese numero de paginas del libro");
        l1.pagina = sc.nextInt();

     
       l1.MostrarLibro(l1.isbn, l1.titulo, l1.autor, l1.pagina);
      // maldita sea  obvio no iba a funcionar Libro.MostrarLibro(isbn, titulo, autor, paginas);
// LAS VARIABLES TAMBIEN TIENEN QUE SER  l1 SINO NO LAS RECONOCE POR DIOOOOOOOOS CON RAZON QUE GANAS DE MORIR  
    }

}
