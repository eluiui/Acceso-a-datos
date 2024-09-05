/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leercv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author a22jesusbm
 */
public class LeerCV {

    public static void main(String[] args) {
        String archivoEntrada = "datosEstudiantes.csv";
        String archivoSalida = "medias.txt";

        try {
            calcularMedia(archivoEntrada, archivoSalida);
        } catch (IOException e) {
        }
    }

    public static void calcularMedia(String archivoEntrada, String archivoSalida) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(archivoEntrada));
        FileWriter fw = new FileWriter(archivoSalida);

        String linea;
        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(",");
            if (partes.length < 5) {
                continue;
            }

            String nombre = partes[0];
            String apellido = partes[1];
            double nota1 = Double.parseDouble(partes[2]);
            double nota2 = Double.parseDouble(partes[3]);
            double nota3 = Double.parseDouble(partes[4]);
            double promedio = (nota1 + nota2 + nota3) / 3.0;

            String resultado = nombre + " " + apellido + ": Media = " + (int) promedio;
            System.out.println(resultado);
            fw.write(resultado + "\n");
            
        }

        br.close();
        fw.close();
    }
}
