/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread;

/**
 *
 * @author kaliw
 */
public class App {
    
    public static void main(String[] args) throws InterruptedException {
        final Processor processor = new Processor();   
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                
                    processor.produce();
               
            }
        });
        
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                
               
                    processor.consume();
                
                
            }
        });
        
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        
        
        
        
        
        
        
    }
    
    
    
    
}
