/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author a22jesusbm
 */
public class Repaso {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Cadena cadena = new Cadena();
        System.out.println("Nombre: ");
        String cad = scan.nextLine();
        System.out.println(cadena.cifradoCesar(cad));

        Lectura num = new Lectura();
        num.menu();

        Date date = new Date();
        System.out.println("Introduce primer nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Introduce segundo nombre: ");
        String nombre1 = scan.nextLine();
        System.out.println("Introduce primera fecha de nacimiento [dd/mm/aaaa]: ");
        String fecha = scan.nextLine();
        System.out.println("Introduce segunda fecha de nacimiento [dd/mm/aaaa]: ");
        String fecha1 = scan.nextLine();
        System.out.println(date.calcularMayor(nombre, nombre1, fecha, fecha1));

    }

}
