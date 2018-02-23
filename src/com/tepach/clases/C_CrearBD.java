/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tepach.clases;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import static java.util.UUID.randomUUID;

/**
 *
 * @author inspector
 */
public class C_CrearBD {
public String nombreArchivo=null;
    public String crearUUID() {
        return randomUUID().toString().toUpperCase();
    }

    public boolean creartxt(ArrayList<String> baseNueva) {
        boolean ejecutado=false;
        FileWriter fichero = null;
        PrintWriter pw = null;
        Calendar c = new GregorianCalendar();
        nombreArchivo="UUID-"+(c.get(Calendar.HOUR)+"-"+c.get(Calendar.MINUTE)+"-"+c.get(Calendar.SECOND))+".txt";
        try {
            fichero = new FileWriter(nombreArchivo);
            pw = new PrintWriter(fichero);

            for (int i = 0; i < baseNueva.size(); i++) {
                pw.println(baseNueva.get(i));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return ejecutado;
    }
}
