/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.codigo;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author kaliw
 */
public class Lamina extends JPanel{
    
    //PUNTOS PARA LOS CIRCULOS QUE SE VANA GUARDAR EN UN ARREGLO
    private Point[] puntos= new Point[70];
    //La dimension del a pantalla
    private Dimension pantalla =null;
    //Random

    
    
    
    
    
    public Lamina(Dimension pantalla) {
        this.pantalla=pantalla;
       
    }
    
    private void createCircles(){
            Random rd = new Random();
        for (int i = 0; i < puntos.length; i++) {
            puntos[i]= new Point(rd.nextInt(pantalla.width),
                    rd.nextInt(pantalla.height));
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < puntos.length; i++) {
            g.drawOval(puntos[i].x, puntos[i].y, 10, 10);
            if(i<puntos.length-1){
                
               g.drawLine(puntos[i].x + 5, puntos[i].y+5,puntos[i+1].x+5, puntos[i+1].y+5);
               
            }
        }
        createCircles();
    }
    
}
