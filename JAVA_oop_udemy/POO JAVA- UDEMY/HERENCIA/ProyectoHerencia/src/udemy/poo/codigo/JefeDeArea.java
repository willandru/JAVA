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
public class JefeDeArea extends Persona {

    public JefeDeArea(String nombre, double sueldo) {
        super(nombre, sueldo);
    }
    @Override
    public double incrementoSueldo() {
        return this.getSueldo() *2;
    }
    
}
