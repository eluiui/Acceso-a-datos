package com.mycompany.academiamas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Alumno {

    private String nombre, localidad;
    List<Modulo> modulos = new ArrayList<>();

    public Alumno(String nombre, String localidad){
        this.nombre = nombre;
        this.localidad = localidad;
    }

    public Alumno(String nombre, String localidad, List<Modulo> modulos){
        this.nombre = nombre;
        this.localidad = localidad;
        this.modulos = modulos;
    }

    public void addModulo(Modulo modulo){
        modulos.add(modulo);
    }

    public List<String> getNombreModulos(){
        List<String> listaNombres = new ArrayList<>();
        Iterator<Modulo> iter = modulos.iterator();
        while(iter.hasNext()){
            listaNombres.add(iter.next().getNombre());
        }
        return listaNombres;
    }

    public int getNumeroHoras(){
        int horas = 0;
        Iterator<Modulo> iter = modulos.iterator();
        while(iter.hasNext()){
            horas += iter.next().getHoras();
        }
        return horas;
    }

    public String getNombre() {
        return nombre;
    }
    
    public List<Modulo> getListaModulos() {
        return modulos;
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
