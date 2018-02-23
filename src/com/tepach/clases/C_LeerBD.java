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
import javax.swing.JOptionPane;
import javax.swing.plaf.RootPaneUI;

/**
 *
 * @author inspector
 */
public class C_LeerBD {
public String btn="";
    public ArrayList<String> foliosViejos(String ruta) {
        ArrayList<String> folvij = new ArrayList<>();
        
        FileReader f;
        String filas;
        try {
            f = new FileReader(ruta);
            BufferedReader b = new BufferedReader(f);
            while ((filas = b.readLine()) != null) {
                if (filas.length()==36) {
                    folvij.add(filas);
                    btn="Generar nuevos UUID";
                }else{
                    JOptionPane.showMessageDialog(null, "El tamaño estandar de un UUID es de 36 caracteres.", "Verifica la BD ingresada", JOptionPane.ERROR_MESSAGE);
                    btn="Cargar BD";
                    break;
                }
              
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
