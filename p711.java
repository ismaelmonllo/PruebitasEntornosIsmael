/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aceptaelreto;

import java.util.Scanner;

/**
 * Los tickets de las entradas a los eventos deportivos suelen incluir un c�digo
 * num�rico incomprensible que ayuda a los organizadores a hacer el seguimiento
 * de qu� entradas han sido utilizadas y cu�les a�n no lo han sido. Como ocurre
 * en muchos otros sitios, esos n�meros incluyen un c�digo de verificaci�n de
 * modo que una parte del n�mero se calcula en realidad a partir del resto. Esto
 * permite comprobar errores en los sistemas automatizados de lectura de los
 * tickets. Si al recalcular el c�digo de verificaci�n se obtiene un valor
 * distinto al que se ha le�do, algo ha ido mal con la lectura y hay que volver
 * a intentarlo.
 *
 * En uno de estos eventos, las entradas se identifican con n�meros a los que se
 * a?ade un c�digo de verificaci�n calculado con la suma de las siguientes
 * cantidades:
 *
 * Cada d�gito en una posici�n impar se multiplica por 3 y se le suma el menor
 * d�gito a su derecha. Cada d�gito en una posici�n par se multiplica por 2 y se
 * le suma el mayor d�gito a su izquierda. La suma de todos esos valores es lo
 * que se utiliza como c�digo de comprobaci�n. Para su c�lculo, no se tienen en
 * cuenta los ceros a la izquierda del n�mero original, y los d�gitos se cuentan
 * de izquierda a derecha, de manera que el d�gito situado m�s a la izquierda es
 * el primero y se considera situado en una posici�n impar.
 *
 * Por ejemplo, la entrada con el n�mero 7214 tiene como c�digo de verificaci�n:
 *
 * (7�3 + 1) + (2�2 + 7) + (1�3 + 4) + (4�2 + 7) = 55
 *
 * La entrada comienza con un primer n�mero que indica cu�ntos casos deben
 * procesarse.
 *
 * Cada caso es un n�mero entre 1 y 1018 con un n�mero par de d�gitos.
 *
 * Por cada caso de prueba se escribir� el c�digo de verificaci�n calculado para
 * el n�mero del ticket.
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
