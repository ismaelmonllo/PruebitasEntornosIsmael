/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aceptaelreto;

import java.util.Scanner;

/**
 *  
 * @author Diurno
 */
public class p595 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion de variables
        Scanner reader = new Scanner(System.in);
        int numeroCasos = 0;
        int casoConcreto = 0;
        // Leemos numero de casos        
        numeroCasos = reader.nextInt();
        for (int i = 0; i < numeroCasos; i++) {
            // Leemos caso concreto
            casoConcreto = reader.nextInt();
            // Mostramos resultado
            System.out.println(casoConcreto/100);
        }
    }
    
}
