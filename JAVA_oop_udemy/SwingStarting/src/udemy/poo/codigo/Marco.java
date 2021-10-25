/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.codigo;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author kaliw
 */
public class Marco extends JFrame{
    private static final int ANCHO=300;
    private static final int ALTO= 300;

    public Marco() throws HeadlessException {
        this.setSize(ANCHO,ALTO);
        this.setLocationRelativeTo(this);
    }
   
    
}
