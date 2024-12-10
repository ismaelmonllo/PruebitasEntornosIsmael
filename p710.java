/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aceptaelreto;

import java.util.Scanner;

/**
 * En la Copa Mundial Femenina de Fútbol de 2023 participaron 32 equipos, cada
 * uno representando a su país, entre ellos Espa?a. El número de países del
 * mundo es mucho mayor que 32, de modo que para poder participar, los equipos
 * tuvieron que superar una fase clasificatoria previa.
 *
 * La Federación Internacional de Fútbol (FIFA) asignó un número de plazas en el
 * mundial a cada una de las seis confederaciones continentales. Así, la UEFA
 * (Europa) recibió 11 plazas, la AFC (Asia) recibió 6, la CAF (África) y la
 * CONCACAF (América del Norte y Centroamérica) recibieron 4 cada una, la
 * CONMEBOL (Sudamérica) recibió 3 y la OFC (Oceanía) recibió 1. El resto de
 * plazas se utilizaron para una repesca intercontinental en la que participaron
 * las selecciones nacionales mejor clasificadas de cada confederación que se
 * hubieran quedado sin hueco. *
 *
 * La entrada comienza con un número indicando cuántos casos de prueba tendrán
 * que procesarse.
 *
 * Cada caso de prueba comienza con un número indicando el número de equipos E
 * (entre 1 y 128) que participan en el Mundial. A continuación aparece el
 * número de plazas reservadas para cada una de las 6 confederaciones
 * continentales. Se garantiza que la suma de esos 6 números no es mayor que E.
 *
 * Por cada caso de prueba el programa deberá escribir el número de plazas que
 * se utilizan en la repesca intercontinental.
 *
 * @author Diurno
 */
public class p710 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        Scanner reader = new Scanner(System.in);
        int numRepeticiones = 0;
        int numPlazas = 0;
        int plazasPorConf = 0;

        numRepeticiones = reader.nextInt();
        for (int i = 0; i < numRepeticiones; i++) {
            plazasPorConf = 0;
            numPlazas = reader.nextInt();
            for (int j = 0; j < 6; j++) {
                plazasPorConf += reader.nextInt();
            }
            System.out.println(numPlazas - plazasPorConf);
        }
    }

}
