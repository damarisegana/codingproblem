/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingproblems;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Duoc UC
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] arrayNumeros = new int[4];
        arrayNumeros[0] = 1;
        arrayNumeros[1] = 2;
        arrayNumeros[2] = 3;
        arrayNumeros[3] = 4;

        int atrasAdelante = arrayNumeros.length - 1;

        int i;
        int largo = arrayNumeros.length;
        int[] arraySalida = new int[arrayNumeros.length];

        for (i = 0; i < largo; i = i + 2) {
            int e = i + 1;
            arraySalida[i] = arrayNumeros[i];
            arraySalida[e] = arrayNumeros[atrasAdelante];
            atrasAdelante = atrasAdelante - 2;
        }

        System.out.println(arraySalida[0] + " " + arraySalida[1] + " " + arraySalida[2] + " " + arraySalida[3] + " ");

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese cantidad de números a ingresar:");
        int cantNumeros = Integer.parseInt(teclado.next());

        int[] arrayPreMultip = new int[cantNumeros];
        int[] arrayPostMultip = new int[cantNumeros];

        for (int c = 0; c < cantNumeros; c++) {
            System.out.println("Ingrese el número " + (c + 1));
            arrayPreMultip[c] = Integer.parseInt(teclado.next());
        }

        int e = 0;
        i = 0;
        int resultadomultip = 1;

        while (i <= cantNumeros - 1) {
            int guardarNumero = arrayPreMultip[i];
            if (e < cantNumeros) {
                arrayPreMultip[i] = 1;
                resultadomultip = (resultadomultip * arrayPreMultip[e]);
                arrayPreMultip[i] = guardarNumero;
                e++;
            } else if (e == cantNumeros) {
                e = 0;
                arrayPreMultip[i] = guardarNumero;
                arrayPostMultip[i] = resultadomultip;
                resultadomultip = 1;
                i++;
            }    
        }
        System.out.println(Arrays.toString(arrayPostMultip));

    }

}
