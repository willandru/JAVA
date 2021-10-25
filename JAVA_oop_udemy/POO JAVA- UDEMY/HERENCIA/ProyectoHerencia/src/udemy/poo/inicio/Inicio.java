/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.inicio;

import javax.swing.JOptionPane;
import udemy.poo.codigo.Elipse;
import udemy.poo.codigo.ElipseDos;
import udemy.poo.codigo.Empleado;
import udemy.poo.codigo.JefeDeArea;
import udemy.poo.codigo.Rectangulo;

/**
 *
 * @author kaliw
 */
public class Inicio {
    public static void main(String[] args) {
        Elipse elip= new Elipse(3,2);
        Rectangulo rec = new Rectangulo(4, 4);
        Empleado emp= new Empleado("JEff", 5000);
        ElipseDos el= new ElipseDos(2, 3, 2, 3);
        
        
        JefeDeArea jfa= new JefeDeArea("JEff", 5000);
        JOptionPane.showMessageDialog(null, "Area ELIPSE:"+ elip.area()+ 
                "\n Area RECTANGULO:" + rec.area());
        JOptionPane.showMessageDialog(null, "Sueldo Empleado:"+ 
                emp.incrementoSueldo()+ "\n Sueldo Jefe de Area" + jfa.incrementoSueldo());
        
        JOptionPane.showMessageDialog(null, "Area d Elipse (abstact):"+ 
                elip.area()+ "\n Area de Elipse (normal): " + el.area());
        
    }
}
