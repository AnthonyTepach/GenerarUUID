/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tepach.clases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author inspector
 */
public class C_LeerBD {

    public ArrayList<String> foliosViejos(String ruta) {
        ArrayList<String> folvij = new ArrayList<>();
        
        FileReader f;
        String filas;
        try {
            f = new FileReader(ruta);
            BufferedReader b = new BufferedReader(f);
            while ((filas = b.readLine()) != null) {
              folvij.add(filas);
            }
            b.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return folvij;
    }
}
