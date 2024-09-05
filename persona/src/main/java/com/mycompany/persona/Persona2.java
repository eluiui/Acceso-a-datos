/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persona;

/**
 *
 * @author a22jesusbm
 */
public class Persona2 {

    private String nome;
    private String dataNacemento;
    private double peso;
    private int altura;

    public Persona2(String n, String dN, double p, int a) {

        nome = n;
        dataNacemento = dN;
        peso = p;
        altura = a;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNacemento() {
        return dataNacemento;
    }

    public void setDataNacemento(String dataNacemento) {
        this.dataNacemento = dataNacemento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

}
