/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos.poo.inicio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kaliw
 */
public class EscrituraDeArchivo {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            File archivo = new File(System.getProperty("user.dir") + "/gato.txt");
            fw = new FileWriter(archivo);
            PrintWriter pw  =new PrintWriter(fw);
            
            
            for (int i = 0; i < 7; i++) {
                pw.println("Esta es una linea en JAVA");
            }
            pw.println("Borre los datos?");
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
    
}
