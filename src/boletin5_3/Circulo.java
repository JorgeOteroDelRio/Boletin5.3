/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_3;

/**
 *
 * @author joterodelrio
 */
public class Circulo {
    private double radio;
    private final double PI = 3.14;
    //Constructores
    public Circulo(){}
    public Circulo(double radio){
        this.radio = radio;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }
    public double getRadio(){
        return radio;
    }
    public double calcularArea(){
        return PI * Math.pow(radio,2);
    }
    public double calcularLongitud(){
        return 2 * PI * radio;
    }
}
