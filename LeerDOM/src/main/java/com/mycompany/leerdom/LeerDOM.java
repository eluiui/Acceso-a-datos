/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leerdom;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;

/**
 *
 * @author a22jesusbm
 */
public class LeerDOM {

    public static void main(String[] args) {
        leerLibros();
        calcularMediaPrecios();
    }
    
    public static void calcularMediaPrecios(){
        double precio = 0;
        try {
            File archivoXML = new File("libros.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document documento = (Document) dBuilder.parse(archivoXML);
            documento.getDocumentElement().normalize();

            NodeList listaLibros = documento.getElementsByTagName("libro");

            for (int i = 0; i < listaLibros.getLength(); i++) {
                Node nodoLibro = listaLibros.item(i);

                if (nodoLibro.getNodeType() == Node.ELEMENT_NODE) {
                    Element elementoLibro = (Element) nodoLibro;

                    precio += Double.parseDouble(elementoLibro.getElementsByTagName("precio").item(0).getTextContent());
                }
            }
            
            System.out.println("Media: " + precio/listaLibros.getLength());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    
    public static void leerLibros(){
        try {
            File archivoXML = new File("libros.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document documento = (Document) dBuilder.parse(archivoXML);
            documento.getDocumentElement().normalize();

            NodeList listaLibros = documento.getElementsByTagName("libro");

            for (int i = 0; i < listaLibros.getLength(); i++) {
                Node nodoLibro = listaLibros.item(i);

                if (nodoLibro.getNodeType() == Node.ELEMENT_NODE) {
                    Element elementoLibro = (Element) nodoLibro;

                    String titulo = elementoLibro.getElementsByTagName("titulo").item(0).getTextContent();
                    String autor = elementoLibro.getElementsByTagName("autor").item(0).getTextContent();
                    String precio = elementoLibro.getElementsByTagName("precio").item(0).getTextContent();

                    System.out.println("Título: " + titulo);
                    System.out.println("Autor: " + autor);
                    System.out.println("Precio: " + precio);
                    System.out.println();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
