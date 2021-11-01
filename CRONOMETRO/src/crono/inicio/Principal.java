/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crono.inicio;

import crono.code.Splash;
import crono.code.VentanaCronometro;

/**
 *
 * @author kaliw
 */
public class Principal {
    public static void main(String[] args) {
        
        
        Splash miSplash= new Splash();
        miSplash.setVisible(true);
        
	VentanaCronometro miVentana= new VentanaCronometro();
	miVentana.setVisible(true);
	
	//miVentana.setResizable(false);
}
}
