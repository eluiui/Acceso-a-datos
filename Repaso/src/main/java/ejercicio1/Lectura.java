/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author a22jesusbm
 */
public class Lectura {

    Scanner scan = new Scanner(System.in);
    String Numero2 = "";
    String cadena;
    int separador = cadena.indexOf('.');

    public int getParteEntera(double numero) {
        return (int) numero;
    }

    public double getParteDecimal(double numero) {
        cadena = Double.toString(numero);
        int y = separador + 1;
        while (y < cadena.length()) {
            Numero2 = Numero2 + cadena.charAt(y);
            y++;
        }

        return Integer.parseInt(Numero2);
    }

    public void menu() {
        Lectura num = new Lectura();
        int opcion = 0;
        while (opcion == 3) {
            System.out.print("Numero decimal: ");
            double numero = scan.nextDouble();
            System.out.print("1 Entero" + "2 Decimal" + "Respuesta: ");
            opcion = scan.nextInt();

            if (opcion == 1) {

                System.out.println(num.getParteEntera(numero));

            } else if (opcion == 1) {
                System.out.println(num.getParteDecimal(numero));

            }
        }
    }
}
