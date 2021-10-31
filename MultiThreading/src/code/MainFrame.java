/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingWorker;

/**
 *
 * @author kaliw
 */
public class MainFrame extends JFrame {
    private JLabel count1 = new JLabel ("0");
    private JLabel statusLabel= new JLabel("Task not completed.");
    private JButton startButton= new JButton("START");
    
    public MainFrame(String title){
        super(title);
        setLayout(new GridLayout());
        
        GridBagConstraints g = new GridBagConstraints();
        
        g.fill = GridBagConstraints.NONE;
        
        g.gridx=0;
        g.gridy=0;
        g.weightx=1;
        g.weighty=1;
        add(count1,g);
        
        g.gridx=0;
        g.gridy=1;
        g.weightx=1;
        g.weighty=1;
        add(statusLabel,g);
        
        g.gridx=0;
        g.gridy=2;
        g.weightx=1;
        g.weighty=1;
        add(startButton,g);
        
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                start();
            }
        });
        setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(400, 200);
           
    }
    
    private void start(){
        SwingWorker<Boolean, Integer> worker = new SwingWorker<Boolean, Integer>() {
            @Override
            protected Boolean doInBackground() throws Exception {
                
                for(int i=0; i<30; i++){
                    Thread.sleep(100);
                    System.out.println("Hello in background "+i);
                    
                    publish(i);
                }
                
                return true;
            }

            @Override
            protected void process(List<Integer> chunks) {
                Integer value= chunks.get(chunks.size()-1);
                count1.setText("Current Value: "+value);
            }
            
            

            @Override
            protected void done() {
                try {
                    Boolean status= get();
                   
                    statusLabel.setText("COMPLETED: "+ status);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ExecutionException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            
            
            
        };
        worker.execute();
    }
    
}
