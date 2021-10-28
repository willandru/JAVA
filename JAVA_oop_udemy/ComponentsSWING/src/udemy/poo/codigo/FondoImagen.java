/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.codigo;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author kaliw
 */
public class FondoImagen extends JPanel{
    private Image imagen = null; 
    private MediaTracker tracker; 

    public FondoImagen(Component componente) {
         try{
    tracker= new MediaTracker(componente);
             Toolkit hr = Toolkit.getDefaultToolkit();
             imagen= hr.getImage(getClass().getResource("/udemy/poo/recursos/DaytoNight.gif"));
             tracker.addImage(imagen, 1);
             tracker.waitForAll();
}catch(InterruptedException e){
 e.printStackTrace();
}
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        g.drawImage(imagen, 0, 0, this.getSize().width, this.getSize().height, null);
    
    }
   
    
    
}
