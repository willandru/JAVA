/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.codigo;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author kaliw
 */
public class EventosVentana implements WindowListener{

    @Override
    public void windowOpened(WindowEvent we) {
        System.out.println("Abriendo");
    }

    @Override
    public void windowClosing(WindowEvent we) {
        System.out.println("Cerrando");
    }

    @Override
    public void windowClosed(WindowEvent we) {
        System.out.println("Cerrada");
    }

    @Override
    public void windowIconified(WindowEvent we) {
        System.out.println("Minimizada");
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        System.out.println("Maximizada");
    }

    @Override
    public void windowActivated(WindowEvent we) {
        System.out.println("Activada");
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        System.out.println("Descativada");
    }
    
    
    
    
}
