/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.udemy.codigo;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author kaliw
 */
public class Lamina extends JPanel implements ActionListener {
    
    private JPanel panel= new JPanel();
    private JButton botonGuardar= new JButton("SAVE");
    private JButton botonLeer= new JButton("READ");
    private JLabel nombre = new JLabel("Nombre :");
    private JTextField texNombre= new JTextField(20);
    private JLabel apellidoMaterno = new JLabel("Apellido materno :");
    private JTextField texApellidoMaterno= new JTextField(20);
    private JLabel apellidoPaterno = new JLabel("Apellido paterno :");
    private JTextField texApellidoPaterno= new JTextField(20);
    private JLabel edad = new JLabel("Edad :");
    private JTextField texEdad= new JTextField(20);
    private JTextArea areaTexto = new JTextArea(10,40);
    private JScrollPane scroll;

    public Lamina() {
        this.scroll = new JScrollPane(this.areaTexto);
        this.botonGuardar.addActionListener(this);
        this.botonLeer.addActionListener(this);
        
        JPanel borderPan = new JPanel(new GridLayout(5,2));
        
        nombre.setToolTipText("Ej. Winux KALI");
        borderPan.add(nombre);
        borderPan.add(texNombre);
        
        apellidoMaterno.setToolTipText("Ej. KALI");
        borderPan.add(apellidoMaterno);
        borderPan.add(texApellidoMaterno);
        
        apellidoPaterno.setToolTipText("Ej. LINUX");
        borderPan.add(apellidoPaterno);
        borderPan.add(texApellidoPaterno);
        
        edad.setToolTipText("Ej. 24");
        borderPan.add(edad);
        borderPan.add(texEdad);
        
        borderPan.add(botonGuardar);
        borderPan.add(botonLeer);
        panel.add(borderPan);
        
        
        JPanel bordePanel= new JPanel(new BorderLayout());
        bordePanel.setBorder(new TitledBorder("Datos personales"));
        bordePanel.add(panel, BorderLayout.CENTER);
        
        this.add(bordePanel);
        this.add(scroll);  
    }
    
    private void escribirArchivo(){
        FileWriter fw= null;
        try {
            File f= new File(System.getProperty("usr.dir")+"/Archivo.txt");
            fw = new FileWriter(f);
            PrintWriter pw= new PrintWriter(fw);
            pw.append(this.texNombre.getText() + " " + this.apellidoPaterno.getText()+ " "
            + this.apellidoMaterno.getText()+ " "+ this.edad.getText()+"\n");
            pw.close();
        } catch (IOException ex) {
           ex.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    
    
    private void leerArchvo(){
        FileReader fr= null;
        try {
            File f= new File(System.getProperty("usr.dir")+ "/Archivo");
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String cad="";
            while((cad=br.readLine()) != null){
                this.areaTexto.append(cad+ "\n");
            }
           
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        Object origen = ae.getSource();
        if(origen == this.botonGuardar){
            escribirArchivo();
            this.texNombre.setText("");
            this.texApellidoMaterno.setText("");
            this.texApellidoPaterno.setText("");
            this.texEdad.setText("");       
            this.botonGuardar.transferFocus();
        } else if(origen == this.botonLeer){
            leerArchvo();
            this.botonLeer.transferFocus();
        }
        
    }
    
}
