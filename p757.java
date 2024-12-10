/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aceptaelreto;

import java.util.Scanner;

/**
 * La entrada comienza con un n�mero indicando cu�ntos casos de prueba se deben
 * procesar. Cada uno est� compuesto por una cadena de no m�s de 1.000
 * caracteres, todos ellos 'T' o 'S'.
 *
 * Por cada caso de prueba el programa escribir� la secuencia consecutiva m�s
 * larga de 'T' dentro de la cadena
 *
 * @author Diurno
 */
public class p757 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion de variables
        Scanner reader = new Scanner(System.in);
        int repeticiones = 0;
        String secuencia = "";
        int contador = 0;
        int contadorMayor = 0;
        
        repeticiones = reader.nextInt();
        reader.nextLine();        
        for (int i = 0; i < repeticiones; i++) {
            secuencia = reader.nextLine();
            contador = 0;
            contadorMayor = 0;
            for (int j = 0; j < secuencia.length(); j++) {
                if (secuencia.substring(j, j + 1).equals("T")) {
                    contador++;
                } else {
                    if (contador > contadorMayor) {
                        contadorMayor = contador;
                    }
                    contador = 0;
                }
            }
            if ((contadorMayor == 0) || (contador > contadorMayor)) {
                contadorMayor = contador;
            }
            System.out.println(contadorMayor);
        }
    }

}
