/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.codigo;

import javax.swing.JFrame;

/**
 *
 * @author kaliw
 */
public class Marco extends JFrame{
    
    public Marco(){
        this.setSize(400, 500);
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        this.setTitle("EVENTOS DE RATON Y TECLADO");
        
        Lamina lamina= new Lamina();
        this.add(lamina);
        lamina.setFocusable(true);
    }
    
}
