/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author a22jesusbm
 */
public class Hora {

    private int hor;
    private int min;

    public Hora(int horas, int minutos) {
        this.hor = horas;
        this.min = minutos;
    }

    public void inc() {
        min++;
    }

    public boolean setHoras(int valor) {
        if (valor >= 0 && valor <= 23) {
            this.hor = valor;
            return true;
        }
        return false;
    }

    public boolean setMinutos(int valor) {
        if (valor >= 0 && valor <= 59) {
            this.min = valor;
            return true;
        }
        return false;
    }

    public String toString() {
        return "La hora es "+ hor + ":" + min;
    }
}
