/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author a22jesusbm
 */
public class Date {

    public String calcularMayor(String nombre, String nombre1, String date, String date1) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/aaaa");
        LocalDate fecha = LocalDate.parse(date, formatter);
        LocalDate fecha1 = LocalDate.parse(date1, formatter);

        int edad = LocalDate.now().getYear() - fecha.getYear();
        int edad1 = LocalDate.now().getYear() - fecha1.getYear();
        if (fecha.isBefore(fecha1)) {
            return nombre + " es mayor." + "\n" + nombre + " tiene " + edad + " y " + nombre1 + " tiene " + edad1;
        } else {
            return nombre1 + " es mayor." + "\n" + nombre1 + " tiene " + edad1 + " y " + nombre + " tiene " + edad;
        }
    }
}
