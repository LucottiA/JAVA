/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luco;

import static java.lang.Math.PI;

/**
 *
 * @author Usuario
 */
public class POO02Circunferencia {

    private double radio;

    public POO02Circunferencia(double radio) {
        this.radio = radio;
    }
//ahh este de abajo es el constructor vacio 
    public POO02Circunferencia() {
    }

    public double getRadio() { //no void sino double
        return this.radio;
        
    }
//algo de encapsular
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia(double radio) {
        this.radio = radio;
    }
//abstraer?
    public double getArea(){
        double area;
        area = PI * Math.pow(this.radio, 2);
        return area;
    }
    public double getPerimetro(){
     double perimetro;
     perimetro = 2 * PI * this.radio;
     return perimetro;
    }
//constructor comun?
//    public POO02Circunferencia(int radio, double area, double circunferencia) {
//        this.radio = radio;
//        this.area = area;
//        this.circunferencia = circunferencia;
}

//Area = π ∗ radio!
//Perimetro = 2 ∗ π ∗ radio

