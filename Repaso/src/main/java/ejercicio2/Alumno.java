/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author a22jesusbm
 */
public class Alumno {

    private String nombre;
    private String localidad;
    ArrayList<Modulo> modulos = new ArrayList<>();

    public Alumno(String nombre, String localidad) {
        this.nombre = nombre;
        this.localidad = localidad;
    }

    public Alumno(String nombre, String localidad, ArrayList<Modulo> modulos) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.modulos = modulos;
    }

    public void addModulo(Modulo modulo) {
        modulos.add(modulo);
    }

    public ArrayList<String> getModulos() {
        ArrayList<String> Nombres = new ArrayList<>();
        for (Modulo modulo : modulos) {
            Nombres.add(modulo.getNombre());
        }
        return Nombres;

    }

    public double getNumeroHoras() {
        double horas = 0;
        for (Modulo modulo : modulos) {
            horas += modulo.getHoras();
        }
        return horas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
}
