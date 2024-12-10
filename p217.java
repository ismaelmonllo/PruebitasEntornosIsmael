/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aceptaelreto;

import java.util.Scanner;

/**
 * El programa recibirá, por la entrada estándar, un conjunto de casos de
 * prueba, cada uno en una línea. Cada caso de prueba estará compuesto de un
 * número de vivienda. Se garantiza que nunca será mayor que 1.000.
 *
 * El último caso, que no deberá procesarse, será el número 0.
 *
 * @author Diurno
 */
public class p217 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion de variables
        Scanner reader = new Scanner(System.in);
        short numeroCalle = 0;
        // Bucle
        do {
            numeroCalle = reader.nextShort();
            if (numeroCalle == 0) {
                break;
            } else if (numeroCalle % 2 == 0) {
                System.out.println("DERECHA");
            } else {
                System.out.println("IZQUIERDA");
            }
        } while (true);
    }

}
