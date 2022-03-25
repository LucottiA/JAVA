/*
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.
 */
package luco;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class POO03Operacion {
    
    Scanner sc = new Scanner(System.in);
    
    private int numero1;
    private int numero2;
    
//a) Método constructor con todos los atributos pasados por parámetro.
    public POO03Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //b) Metodo constructor sin los atributos pasados por parámetro.  ?
    public POO03Operacion() {
    }
//c) Métodos get y set.
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    //d) Método para crearOperacion(): que le pide al usuario los dos números y los
    // guarda en los atributos del objeto.
    
    public void crearOperacion(){
        System.out.println("Ingrese numeros");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();
               
    }
    //e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public void sumar(){
        System.out.println("Suma = " + (numero1+numero2));
    }
        
//f) Método restar(): calcular la resta de los números y devolver el resultado al main
    public void restar(){
         System.out.println("Resta = " + (numero1-numero2));
    }
    
//g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
    public void multiplicar(){
        if (numero1==0 || numero2==0) {
            System.out.println("Hay un 0, la multiplicacion es 0 boludo.");
            
        } else {
           System.out.println("Multiplicacion = " + (numero1*numero2));
        }
        
    }
    
    //h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
//pasar una división por cero
    public void dividir(){
        if (numero1==0 || numero2==0) {
            System.out.println("Hay un 0, la division no es posible.");
            
        } else {
           System.out.println("Division = " + (numero1/numero2));
        }
        
    }
    
    //todo muy bello, el unico problema es el uso del this.numero1 numero2, otra persona lo uso en todos y no entiendo todavia del todo si es necesario gg
}
