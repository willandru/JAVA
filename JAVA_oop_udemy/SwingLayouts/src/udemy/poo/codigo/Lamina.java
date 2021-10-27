/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.codigo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author kaliw
 */
public class Lamina extends JPanel implements ActionListener{

    private JPanel panel = new JPanel();
    private JButton button= new JButton("Agregar");
    private JTextField texFiel= new JTextField(30);
    private JTextArea texArea = new JTextArea(10,20);
    private JScrollPane scroll;
    
    
    public Lamina(){
        //AÑADIR EL SCROLL AL AREA DE TEXTO
        this.scroll = new JScrollPane(this.texArea);
        //AGREGAR EVENTO AL OYENTE DEL BOTON
        this.button.addActionListener(this);
        //AGREGAR LOS COMPONENTES AL PANEL
        panel.add(button);
        panel.add(texFiel);
        //CREAR UN BORDER LAYOUT
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.setBorder(new TitledBorder("Componentes de Swing"));
        borderPanel.add(panel, BorderLayout.CENTER);
        this.add(borderPanel);
        this.add(scroll);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object origen = ae.getSource();
        
        //SIE L BOTON GENERA EL EVENTO
        if(origen == this.button){
            //Tomar el texto de la caja de texto
            this.texArea.append(this.texFiel.getText() + "\n");
            this.texArea.setEditable(false);
            //LIMPIAR LA CAJA DE TEXTO
            this.texFiel.setText("");
            
            //TRANSFERIR EL FOCUS AL BOTON
            this.button.transferFocus();
            
        }
   }
    
}
