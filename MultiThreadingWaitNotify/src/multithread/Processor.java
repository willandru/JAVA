/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kaliw
 */
public class Processor {

    void consume() {
        synchronized(this){
            System.out.println("PRODUCER thread running ....");
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Processor.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Resumed.");
        }
    }

    void produce() {
        Scanner sc = new Scanner(System.in);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Processor.class.getName()).log(Level.SEVERE, null, ex);
        }
        synchronized(this){
            System.out.println("Waiting for return key");
            sc.nextLine();
            System.out.println("Return key pressed");
            notifyAll();
        }
    }
    
}
