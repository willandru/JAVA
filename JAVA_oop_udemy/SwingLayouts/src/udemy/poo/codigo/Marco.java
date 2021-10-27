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
public class Marco extends JFrame {
    
    public Marco(){
        this.setSize(600,300);
        this.setLocationRelativeTo(this);
        this.setTitle("GEstores y Eventos");
        this.setResizable(false);
        
        Lamina lamina= new Lamina();
        add (lamina);
    }
    
    
    
    
    
    
    
}
