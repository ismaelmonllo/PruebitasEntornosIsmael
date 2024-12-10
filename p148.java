/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aceptaelreto;

import java.util.Scanner;

/**
 * La entrada consiste en una serie de horas, cada una en una línea. Cada hora
 * está formada por las horas y los minutos separados por : y utilizando siempre
 * dos dígitos. Se utiliza una representación en formato 24 horas (es decir,
 * desde 00:00 a 23:59).
 *
 * La entrada termina cuando la hora es la medianoche (00:00), que no debe
 * procesarse.
 *
 * Para cada caso de prueba se mostrará una línea con el número de minutos que
 * faltan para medianoche.
 *
 * @author Diurno
 */
public class p148 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion de variables
        Scanner reader = new Scanner(System.in);
        String hora = "";
        int hh = 0;
        int mm = 0;

        do {
            hora = reader.nextLine();

            if (hora.equals("00:00")) {
                break;
            } else {
                hh = Integer.parseInt(hora.substring(0, 2));
                mm = Integer.parseInt(hora.substring(3, 5));
                
                System.out.println(((24 * 60) - ((hh * 60) + mm)));
            }
        } while (true);
    }

}
