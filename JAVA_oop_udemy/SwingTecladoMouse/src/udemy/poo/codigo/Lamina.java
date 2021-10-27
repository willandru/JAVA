/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.codigo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author kaliw
 */
public class Lamina extends JPanel implements MouseMotionListener, MouseListener, KeyListener{

    private Point puntoUno = new Point();
    private Point puntoDos = new Point();
    private String tipoTecla = "Sin forma que dibujar";
    private int codigo;
    private boolean puntoInicial=false;
    private Line2D linea= null;
    private ArrayList<Shape> formas= new ArrayList<>();
    
    
    
    public Lamina(){
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
        this.addKeyListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D gg = (Graphics2D) g;
        gg.drawString("("+puntoUno.x + ","+ puntoUno.y + ")", 20, 20);
        gg.drawString("("+puntoDos.x + ","+ puntoDos.y + ")", 80, 20);
        gg.drawString(tipoTecla,180,20);
        
        if(!formas.isEmpty()){
            for(Shape forma: formas){
                gg.draw(forma);
            }
        }

    }
    
    
    
    
    @Override
    public void mouseDragged(MouseEvent me) {
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        if(!puntoInicial){
            puntoUno = me.getPoint();
            puntoDos = me.getPoint();
            puntoUno.x += 5;
            puntoUno.y += 5;
        } else{
            puntoDos = me.getPoint();
            puntoDos.x += 5;
            puntoDos.y += 5 ;
        }
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if(!puntoInicial){
            this.puntoInicial = true;
        } else{
            this.puntoInicial = false;
            if (codigo ==1 ){
                this.formas.add(new Line2D.Float(puntoUno.x,puntoUno.y
                        ,puntoDos.x, puntoDos.y));  
            } else if(codigo ==2){
                this.formas.add(new Rectangle2D.Float(puntoUno.x, puntoUno.y, puntoDos.x - puntoUno.x, puntoDos.y - puntoUno.y));
                
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        int codigoTeclaVirt = ke.getKeyCode();
        if(codigoTeclaVirt== KeyEvent.VK_L){
            this.tipoTecla= "Creación de lineas";
            this.codigo=1;
        }else if(codigoTeclaVirt == KeyEvent.VK_R) {
            this.tipoTecla= "Creacion de rectangulos";
            this.codigo=2;
        }
        else if(codigoTeclaVirt == KeyEvent.VK_C) {
            this.tipoTecla= "Sin fomra que dibujar";
            this.codigo=0;
        }
        else if(codigoTeclaVirt == KeyEvent.VK_B) {
            this.tipoTecla= "Limpiando la lamina";
            this.puntoInicial= false;
            this.codigo=0;
            this.formas.clear();
        }else if(codigoTeclaVirt == KeyEvent.VK_A) {
            this.tipoTecla= "Anulando el punto inicial";
            this.puntoInicial=false;
            this.codigo=0;
        }else if(codigoTeclaVirt == KeyEvent.VK_Z) {
            this.tipoTecla= "Deshaciendo ultima forma";
            this.puntoInicial=false;
            this.codigo=0;
            if (!formas.isEmpty()) {
                this.formas.remove(this.formas.size()-1); 
                
            }
        }
        repaint();
    }
    

    @Override
    public void keyReleased(KeyEvent ke) {
    }
    
    
}
