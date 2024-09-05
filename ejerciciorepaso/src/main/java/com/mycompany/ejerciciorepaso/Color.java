/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciorepaso;

import java.util.Scanner;

/**
 *
 * @author a22jesusbm
 */
public class Color {

    double R, G, B;

    public Color(double R, double G, double B) {
        setR(R);
        setG(G);
        setB(B);
    }

    public void mostrar() {
        System.out.println("Rojo: " + R + " Verde: " + G + " Azul: " + B);
    }

    public void gris() {
        double valorMedio = (R + G + B) / 3;
        setR(valorMedio);
        setG(valorMedio);
        setB(valorMedio);
    }

    public boolean filtro(double filtror, double filtrog, double filtrob) {
        if ((filtror > 1 && filtror < 0) || (filtrog > 1 && filtrog < 0) || (filtrob > 1 && filtrob < 0)) {
            return false;
        } else {
            setR(filtror * R);
            setG(filtrog * G);
            setB(filtrob * B);
            return true;
        }

    }

    public void setR(double R) {
        this.R = comprobar(R);
    }

    private double comprobar(double valor) {
        if (valor > 1) {
            valor = 1;
        } else if (valor < 0) {
            valor = 0;
        }
        return valor;
    }

    public void setG(double G) {
        this.G = comprobar(G);
    }

    public void setB(double B) {
        this.B = comprobar(B);
    }

}
