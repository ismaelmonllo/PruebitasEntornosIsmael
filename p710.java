/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aceptaelreto;

import java.util.Scanner;

/**
 * En la Copa Mundial Femenina de F�tbol de 2023 participaron 32 equipos, cada
 * uno representando a su pa�s, entre ellos Espa?a. El n�mero de pa�ses del
 * mundo es mucho mayor que 32, de modo que para poder participar, los equipos
 * tuvieron que superar una fase clasificatoria previa.
 *
 * La Federaci�n Internacional de F�tbol (FIFA) asign� un n�mero de plazas en el
 * mundial a cada una de las seis confederaciones continentales. As�, la UEFA
 * (Europa) recibi� 11 plazas, la AFC (Asia) recibi� 6, la CAF (�frica) y la
 * CONCACAF (Am�rica del Norte y Centroam�rica) recibieron 4 cada una, la
 * CONMEBOL (Sudam�rica) recibi� 3 y la OFC (Ocean�a) recibi� 1. El resto de
 * plazas se utilizaron para una repesca intercontinental en la que participaron
 * las selecciones nacionales mejor clasificadas de cada confederaci�n que se
 * hubieran quedado sin hueco. *
 *
 * La entrada comienza con un n�mero indicando cu�ntos casos de prueba tendr�n
 * que procesarse.
 *
 * Cada caso de prueba comienza con un n�mero indicando el n�mero de equipos E
 * (entre 1 y 128) que participan en el Mundial. A continuaci�n aparece el
 * n�mero de plazas reservadas para cada una de las 6 confederaciones
 * continentales. Se garantiza que la suma de esos 6 n�meros no es mayor que E.
 *
 * Por cada caso de prueba el programa deber� escribir el n�mero de plazas que
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
