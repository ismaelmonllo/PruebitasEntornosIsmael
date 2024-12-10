/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aceptaelreto;

import java.util.Scanner;

/**
 * Los tickets de las entradas a los eventos deportivos suelen incluir un código
 * numérico incomprensible que ayuda a los organizadores a hacer el seguimiento
 * de qué entradas han sido utilizadas y cuáles aún no lo han sido. Como ocurre
 * en muchos otros sitios, esos números incluyen un código de verificación de
 * modo que una parte del número se calcula en realidad a partir del resto. Esto
 * permite comprobar errores en los sistemas automatizados de lectura de los
 * tickets. Si al recalcular el código de verificación se obtiene un valor
 * distinto al que se ha leído, algo ha ido mal con la lectura y hay que volver
 * a intentarlo.
 *
 * En uno de estos eventos, las entradas se identifican con números a los que se
 * a?ade un código de verificación calculado con la suma de las siguientes
 * cantidades:
 *
 * Cada dígito en una posición impar se multiplica por 3 y se le suma el menor
 * dígito a su derecha. Cada dígito en una posición par se multiplica por 2 y se
 * le suma el mayor dígito a su izquierda. La suma de todos esos valores es lo
 * que se utiliza como código de comprobación. Para su cálculo, no se tienen en
 * cuenta los ceros a la izquierda del número original, y los dígitos se cuentan
 * de izquierda a derecha, de manera que el dígito situado más a la izquierda es
 * el primero y se considera situado en una posición impar.
 *
 * Por ejemplo, la entrada con el número 7214 tiene como código de verificación:
 *
 * (7×3 + 1) + (2×2 + 7) + (1×3 + 4) + (4×2 + 7) = 55
 *
 * La entrada comienza con un primer número que indica cuántos casos deben
 * procesarse.
 *
 * Cada caso es un número entre 1 y 1018 con un número par de dígitos.
 *
 * Por cada caso de prueba se escribirá el código de verificación calculado para
 * el número del ticket.
 *
 * @author Diurno
 */
public class p711 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        Scanner reader = new Scanner(System.in);
        int numRepeticiones = 0;
        String codigoNumerico = "";
        int codigoNumericoInt = 0;
        int numeroVerificacion = 0;
        int digito = 0;
        int numeroMayor = 0;
        int numeroMenor = 0;
        int suma = 0;

        numRepeticiones = reader.nextInt();
        for (int i = 0; i < numRepeticiones; i++) {
            codigoNumericoInt = reader.nextInt();
            codigoNumerico = codigoNumericoInt + "";
            numeroVerificacion = 0;
            for (int j = 0; j < codigoNumerico.length(); j++) {
                digito = Integer.parseInt(codigoNumerico.substring(j, j + 1));
                numeroMayor = 0;
                numeroMenor = 10;
                if ((j + 1) % 2 != 0) {
                    for (int k = j; k < codigoNumerico.length(); k++) {
                        if ((Integer.parseInt(codigoNumerico.substring(k, k + 1))) > numeroMayor) {
                            numeroMayor = Integer.parseInt(codigoNumerico.substring(k, k + 1));
                        }
                    }
                    suma = (digito * 3) + numeroMayor;
                    numeroVerificacion += suma;
                } else {
                    for (int k = codigoNumerico.length() - 1; k >= j; k--) {
                        if ((Integer.parseInt(codigoNumerico.substring(k, k + 1))) < numeroMenor) {
                            numeroMenor = Integer.parseInt(codigoNumerico.substring(k, k + 1));
                        }
                    }
                    suma = (digito * 2) + numeroMenor;
                    numeroVerificacion += suma;
                }
            }
            System.out.println(numeroVerificacion);
        }
    }
}
