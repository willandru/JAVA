/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos.poo.inicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kaliw
 */
public class Archivo {

    public static void main(String[] args) {
        FileReader fr = null;
        try {
            File texto = new File(System.getProperty("user.dir") + "/gato");
            fr = new FileReader(texto);
            BufferedReader br = new BufferedReader(fr);
            String cad = "";

            while ((cad = br.readLine()) != null) {
                System.out.println(cad);
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
    }
}
