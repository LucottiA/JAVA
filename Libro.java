package luco;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Usuario
 */
public class Libro {

//    public static void LlenarLibro() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    public static void MostrarLibro(String isbn, String titulo, String autor, int paginas) { 

//            System.out.println("Autor: " autor + "\n Titulo: " + titulo + "\n ISBN: " + isbn + "\n Paginas: " + paginas);          
//}


    public String isbn;
    public String titulo;
    public String autor;
    public int pagina;
//click derecho insert code - constructor 
    //constructor: llenar libro tambien? 
    public Libro(String isbn, String titulo, String autor, int pagina) {
        //this asigna ? mmmm pelado
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.pagina = pagina;
    }
   
    public Libro() {} // para que sera esto ,mmmm
    
//    public void LlenarLibro(String isbn, String titulo, String autor, int paginas){
//  //me parece al pedo esto de llenar pero no se we algo no estoy entendienndo 
//        this.isbn = isbn;
//        this.titulo = titulo;
//        this.autor = autor;
//        this.paginas = paginas;
//    }
    //mostrar el final, no usar ; en clases ja
  
    /**
     *
     * @param isbn
     * @param titulo
     * @param autor
     * @param pagina
     */
    public void MostrarLibro(String isbn, String titulo, String autor, int pagina) { 

            System.out.println("Autor: " + autor + "\nTitulo: " + titulo + "\nISBN: " + isbn + "\nPaginas: " + pagina);
            // ACA NO HACE FALTA ESPECIFICAR CREO lo de l1 System.out.println("Autor: " + l1.autor + "\nTitulo: " + l1.titulo + "\nISBN: " + l1.isbn + "\nPaginas: " + l1.pagina);
            

}



    
    
    

    

}
