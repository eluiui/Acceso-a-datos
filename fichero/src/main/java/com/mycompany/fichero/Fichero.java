/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.fichero;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a22jesusbm
 */
public class Fichero {

    /**
     * @param args the command line arguments
     */
    static int TAM_FILA = 0;
    static int MAX_BYTE = 0;

    public static void main(String[] args) {

        File directorio = new File("../Ficheros");
        mostrarContenido(directorio);

        Scanner scan = new Scanner(System.in);
        System.out.print("Directorio: ");
        String archivo = scan.nextLine();
        File archivoFile = new File(archivo);
        mostrarContenido(archivoFile);

        leerLineas();
    }

    public static void mostrarContenido(File directorio) {
        if (directorio.exists() && directorio.isDirectory()) {
            File[] contenido = directorio.listFiles();

            for (File elemento : contenido) {
                if (elemento.isDirectory()) {
                    System.out.println(elemento.getName());
                }
            }
        } else if (directorio.exists() && directorio.isFile()) {
            System.out.println(directorio.getName());
            System.out.println(directorio.getAbsolutePath());
        } else {
            System.out.println("La ruta especificada no existe.");
        }
    }

    public static void leerLineas() {
        String nombreArchivo = "pom.xml";

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            int numeroLinea = 1;

            while ((linea = br.readLine()) != null) {
                System.out.println("Línea " + numeroLinea + ": " + linea);
                numeroLinea++;
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

    }

    public static void mostrarBinario(String nombreArchivo) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(nombreArchivo))) {
            int bytesRead;
            int totalBytesRead = 0;

            while (totalBytesRead < MAX_BYTE && (bytesRead = bis.read()) != -1) {
                totalBytesRead++;
                if (totalBytesRead > MAX_BYTE) {
                    break;
                }

                if (totalBytesRead % TAM_FILA == 1) {
                    System.out.printf("Bloque %d:\n", totalBytesRead / TAM_FILA);
                }
                System.out.printf("%02X ", bytesRead);

                if (totalBytesRead % TAM_FILA == 0) {
                    System.out.println();
                }
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void contarLineas() {
        try {
            FileReader fileReader = new FileReader("texto.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int lineas = 0;

            while (bufferedReader.readLine() != null) {
                lineas++;
            }

            bufferedReader.close();
            System.out.println("Tiene: " + lineas + " lineas");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
