/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSaving.code;

import dataSaving.data.DataStorage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author kaliw
 */
public class Main {
    
    int playerHP=10;
    int playerLevel=0;
    JTextArea jta;
    JTextField jtf;
    String playerName="Kali";
    JButton b1,b2,save,load;
    public static void main(String[] args) {
       new Main();
       
    }
    
    public Main(){
        
        //WINDOW
        JFrame window= new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 500);
        window.setLayout(null);
        
        //TEXT
        jta = new JTextArea();
        jta.setBounds(50, 50, 300, 150);
        window.add(jta);
        //NAME BOX
        
        jtf= new JTextField();
        jtf.setBounds(50,200,200,50);
        jtf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                playerName= jtf.getText();
                updateText();
            }
        });
        window.add(jtf);
        
        //LEVEL BUTTON
        b1= new JButton("Level UP");
        b1.setBounds(50, 250, 200, 50);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                playerLevel++;
                updateText();
            }
        });
        window.add(b1);
        
        
        //HP BUTTON
        b2= new JButton("HP UP");
        b2.setBounds(50, 300, 200, 50);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                playerHP++;
                updateText();
            }
        });
        window.add(b2);
        
        //SAVE BUTTON
        save= new JButton("SAVE");
        save.setBounds(50, 350, 200, 50);
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    FileOutputStream fos = new FileOutputStream("save.dat");
                    BufferedOutputStream bos = new BufferedOutputStream(fos);
                    ObjectOutputStream oos = new ObjectOutputStream(bos);
                    
                    DataStorage ds = new DataStorage();
                    ds.pName= playerName;
                    ds.pLevel= playerLevel;
                    ds.pHP= playerHP;
                    
                    oos.writeObject(ds);
                    oos.close();
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        window.add(save);
        
        //LOAD BUTTON
        load= new JButton("LOAD");
        load.setBounds(50, 400, 200, 50);
        load.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               
                try {
              
                FileInputStream fis= new FileInputStream("save.dat");
                BufferedInputStream bis = new BufferedInputStream(fis);
                ObjectInputStream ois= new ObjectInputStream(bis);  
                 DataStorage ds= (DataStorage) ois.readObject();
                 playerName= ds.pName;
                 playerLevel= ds.pLevel;
                 playerHP= ds.pHP;
                 ois.close();
                 
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }catch (IOException e) {
                    e.printStackTrace();}
                
                updateText();
            }
        });
        window.add(load);
        
        window.setVisible(true);
        updateText();
        
    }
    
    private void updateText(){
        jta.setText("Name: "+ playerName+ "\n Level: "+ playerLevel
        + "\n HP: "+ playerHP);
    }
}
