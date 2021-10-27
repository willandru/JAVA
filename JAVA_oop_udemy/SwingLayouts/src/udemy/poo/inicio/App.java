/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.inicio;

import javax.swing.JFrame;
import udemy.poo.codigo.Marco;

/**
 *
 * @author kaliw
 */
public class App {
    public static void main(String[] args) {
        Marco mrc= new Marco();
        mrc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mrc.setVisible(true);
    }
}
