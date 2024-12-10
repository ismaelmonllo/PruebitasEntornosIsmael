/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aceptaelreto;

import java.util.Scanner;

/**
 * La entrada comienza con un número que indica cuántos casos de prueba deberán
 * ser procesados. Cada caso de prueba son dos números representando dos a?os
 * entre 1600 y 2400. Se garantiza que el primer número no será nunca mayor que
 * el segundo.
 *
 * Por cada caso de prueba el programa escribirá dos números, el primero
 * indicando cuántos a?os del rango se celebró, o se celebrará, el Día Mundial
 * del Piano el día 29 de marzo, y el segundo indicando en cuántos se hará el
 * 28. Recuerda que un a?o es bisiesto si es divisible por 4, salvo que sea
 * divisible por 100, en cuyo caso para ser bisiesto debe también serlo por 400.
 * Por ejemplo, el a?o 2000 fue bisiesto (es divisible por 100 y por 400) pero
 * el 2100 no lo será (es divisible por 100, pero no por 400).
 *
 * @author Diurno
 */
public class p676 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        String parejaAnhos = "";
        int anhoMayor = 0;
        int anhoMenor = 0;
        int numeroCasos = 0;

        numeroCasos = reader.nextInt();

        for (int i = 0; i < numeroCasos; i++) {
            do {
                parejaAnhos = reader.nextLine();
                anhoMayor = Integer.parseInt(parejaAnhos.substring(0, 4));
                anhoMayor = Integer.parseInt(parejaAnhos.substring(5, 9));
            } while (false);
        }
    }

}
