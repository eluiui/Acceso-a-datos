/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author a22jesusbm
 */
public class Trabajador {

    private String nombre;
    private int edad;
    private int categoria;
    private int antigüedad;
    static double sueldobase = 607;
    public static final int CAT_EMPLEADO = 0;
    public static final int CAT_ENCARGADO = 1;
    public static final int CAT_DIRECTIVO = 2;
    public static final int ANT_NOVATO = 0;
    public static final int ANT_MADURO = 1;
    public static final int ANT_EXPERTO = 2;

    public Trabajador(String nombre, int edad, int categoría, int antigüedad) {
        comprobar();
        if (comprobar() == true) {
            this.nombre = nombre;
            this.edad = edad;
            this.categoria = categoria;
            this.antigüedad = antigüedad;
        }
    }

    public boolean comprobar() {
        if (this.categoria != 1 && this.categoria != 0 && this.categoria != 2
                && this.antigüedad != 1 && this.antigüedad != 0 && this.antigüedad != 2) {
            throw new IllegalArgumentException();
        }
        return true;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCategoría() {
        return categoria;
    }

    public void setCategoría(int categoría) {
        comprobar();
        if (comprobar() == true) {
            this.categoria = categoria;
        }
    }

    public int getAntigüedad() {
            return antigüedad;
    }

    public void setAntigüedad(int antigüedad) {
        comprobar();
        if (comprobar() == true) {
            this.antigüedad = antigüedad;
        }
    }

    public double calcularSueldo() {
        double sueldo = 0;
        if (this.categoria == 0 && this.antigüedad == 0) {
            sueldo = sueldobase + (sueldobase * 15 / 100) + 150;
        }
        if (this.categoria == 0 && this.antigüedad == 1) {
            sueldo = sueldobase + (sueldobase * 35 / 100) + 300;
        }
        if (this.categoria == 0 && this.antigüedad == 2) {
            sueldo = sueldobase + (sueldobase * 60 / 100) + 600;
        }
        if (this.categoria == 1 && this.antigüedad == 0) {
            sueldo = sueldobase + (sueldobase * 15 / 100) + 150;
        }
        if (this.categoria == 1 && this.antigüedad == 1) {
            sueldo = sueldobase + (sueldobase * 35 / 100) + 300;
        }
        if (this.categoria == 1 && this.antigüedad == 2) {
            sueldo = sueldobase + (sueldobase * 60 / 100) + 600;
        }
        if (this.categoria == 2 && this.antigüedad == 0) {
            sueldo = sueldobase + (sueldobase * 15 / 100) + 150;
        }
        if (this.categoria == 2 && this.antigüedad == 1) {
            sueldo = sueldobase + (sueldobase * 35 / 100) + 300;
        }
        if (this.categoria == 2 && this.antigüedad == 2) {
            sueldo = sueldobase + (sueldobase * 60 / 100) + 600;
        }
        return sueldo;

    }
}
