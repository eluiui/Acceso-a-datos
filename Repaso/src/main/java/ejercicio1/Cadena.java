/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author a22jesusbm
 */
public class Cadena {

    String abecedario = "abcdefghijklmnñopqrstuvwxyzabc";
    String cadena = "";
       
    public String cifradoCesar(String cadenaCifrar){
        int y = 0; 
        while( y < cadenaCifrar.length()){
            
            String letra = Character.toString(abecedario.charAt(abecedario.indexOf(cadenaCifrar.charAt(y))+3));
            if (cadenaCifrar.charAt(y) != ' '){
                cadena =cadena+letra;
            } else{
                cadena =cadena+cadenaCifrar.charAt(y);
            }
            y++;

        }

        return cadena;
    }
}

