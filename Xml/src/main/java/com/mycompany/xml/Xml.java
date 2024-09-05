/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.xml;



import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
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
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

/**
 *
 * @author a22jesusbm
 */
public class Xml {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = dbf.newDocumentBuilder();

        DOMImplementation implementation = builder.getDOMImplementation();

        Document registroEmpleados = implementation.createDocument(null, "empleados", null);
        registroEmpleados.setXmlVersion("1.0");

        Element empleado = registroEmpleados.createElement("empleado");
        registroEmpleados.getDocumentElement().appendChild(empleado);
        Element id = registroEmpleados.createElement("id");
        Text texto = registroEmpleados.createTextNode("01");
        id.appendChild(texto);
        empleado.appendChild(id);
        Element nombre = registroEmpleados.createElement("nombre");
        texto = registroEmpleados.createTextNode("Manolo");
        nombre.appendChild(texto);
        empleado.appendChild(nombre);
        Element apellidos = registroEmpleados.createElement("apellido");
        texto = registroEmpleados.createTextNode("Perez");
        apellidos.appendChild(texto);
        empleado.appendChild(apellidos);

        Source origen = new DOMSource(registroEmpleados);
        Result resultado = new StreamResult(new File("empleados.xml"));
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(origen, resultado);
    }
}
