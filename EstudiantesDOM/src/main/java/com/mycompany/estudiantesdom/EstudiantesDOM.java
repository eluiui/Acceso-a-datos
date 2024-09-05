/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.estudiantesdom;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

/**
 *
 * @author a22jesusbm
 */
public class EstudiantesDOM {

    public static void main(String[] args) {

        while (true) {
            System.out.print("\n1.- Añadir nuevo\n2.- Mostrar todos\nElige una opcion: ");
            int opcion = new Scanner(System.in).nextInt();

            if (opcion == 1) {
                try {
                    addEstudiante();
                } catch (TransformerException ex) {
                    Logger.getLogger(EstudiantesDOM.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParserConfigurationException ex) {
                    Logger.getLogger(EstudiantesDOM.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SAXException ex) {
                    Logger.getLogger(EstudiantesDOM.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(EstudiantesDOM.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                mostrarEstudiantes();
            }
        }

    }

    public static void mostrarEstudiantes() {
        try {
            System.out.println("\nLista de estudiantes: ");
            File archivoXML = new File("estudiantes.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document documento = (Document) dBuilder.parse(archivoXML);
            documento.getDocumentElement().normalize();

            NodeList listaLibros = documento.getElementsByTagName("estudiante");

            for (int i = 0; i < listaLibros.getLength(); i++) {
                Node nodoLibro = listaLibros.item(i);

                if (nodoLibro.getNodeType() == Node.ELEMENT_NODE) {
                    Element elementoLibro = (Element) nodoLibro;

                    String titulo = elementoLibro.getElementsByTagName("id").item(0).getTextContent();
                    String autor = elementoLibro.getElementsByTagName("nombre").item(0).getTextContent();
                    String precio = elementoLibro.getElementsByTagName("edad").item(0).getTextContent();

                    System.out.println("Id: " + titulo);
                    System.out.println("Nombre: " + autor);
                    System.out.println("Edad: " + precio);
                    System.out.println();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void addEstudiante() throws ParserConfigurationException, TransformerException, SAXException, IOException {
        System.out.println("\nCrear estudiante: ");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = dbf.newDocumentBuilder();

        Document documento;
        File archivoXML = new File("estudiantes.xml");
        if (archivoXML.exists()) {
            documento = builder.parse(archivoXML);
        } else {
            DOMImplementation implementation = builder.getDOMImplementation();
            documento = implementation.createDocument(null, "estudiantes", null);
        }

        Element empleado = documento.createElement("estudiante");

        Element id = documento.createElement("id");
        System.out.print("Escribe un id: ");
        Text texto = documento.createTextNode(new Scanner(System.in).nextLine());
        id.appendChild(texto);
        empleado.appendChild(id);

        Element nombre = documento.createElement("nombre");
        System.out.print("Escribe un nombre: ");
        texto = documento.createTextNode(new Scanner(System.in).nextLine());
        nombre.appendChild(texto);
        empleado.appendChild(nombre);

        Element edad = documento.createElement("edad");
        System.out.print("Escribe una edad: ");
        texto = documento.createTextNode(new Scanner(System.in).nextLine());
        edad.appendChild(texto);
        empleado.appendChild(edad);

        documento.getDocumentElement().appendChild(empleado);
        
        Source origen = new DOMSource(documento);
        Result resultado = new StreamResult(new File("estudiantes.xml"));
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.transform(origen, resultado);
        
        
    }
}
