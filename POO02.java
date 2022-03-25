/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio 
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package luco;

/**
 *
 * @author Usuario
 */
public class POO02 {

    /** VER VIDEO POR DIOS https://www.youtube.com/watch?v=_6dpBMVoSmU&list=PLgwlfcqa5h3y1P5W-X13ZD-s1ItKqXcNk&index=6&ab_channel=EggEducaci%C3%B3n
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        POO02Circunferencia c1 = new POO02Circunferencia(); //crear objeto?
        c1.crearCircunferencia(5.35); //determinar nueva circunferencia ?
        System.out.println("Radio: " + c1.getRadio()); // imprimir el radio nuevo que era privado?
        System.out.println("Area: "+ c1.getArea()); // imprimir el resultado del calculo
        System.out.println("Perimetro: "+ c1.getPerimetro()); //imprimir resultado calculo
        
        c1.setRadio(4);//??? ni idea ver videos del pelado
        //puede ser que estoy estableciendo un nuevo valor de radio? con set porque es privado
         System.out.println("Radio: " + c1.getRadio()); // 
        System.out.println("Area: "+ c1.getArea()); // 
        System.out.println("Perimetro: "+ c1.getPerimetro()); //
        
        
        
        
        
        
    }
    
}
