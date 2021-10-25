/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.codigo;

/**
 *
 * @author kaliw
 */
public class Rectangulo extends Figura{
    private double ladoUno;
    private double ladoDos;

    public Rectangulo(double ladoUno, double ladoDos) {
    
        this.ladoUno = ladoUno;
        this.ladoDos = ladoDos;
    }

    @Override
    public double area() {
        return ladoUno*ladoDos;
    }

    @Override
    public double perimetro() {
        return 2*ladoUno + 2*ladoDos;
    }

    
    
}
