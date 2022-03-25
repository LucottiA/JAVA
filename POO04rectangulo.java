/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2
 */
package luco;

public class POO04rectangulo {

    private int altura;
    private int base;

    public POO04rectangulo() {
    }

    public POO04rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }
//creo que no tendria que decir void si le pongo altura y base pero no se, no funca
    public crearRectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base; //con this porque: mmm.... para poder editarlos al ser privados?

    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    
    public double superficie(){
        return base*altura;
    }
    
    public double perimetro(){
        return (base+altura)*2;
    }
}
