/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ss09;

/**
 *
 * @author Gösta Ostendorf <goesta.o@gmail.com>
 */
public class Aufgabe4 {

    public double berechneWurzel(int n, int a) {
        double zwischenwert = 0;
        if (n == 0) {
            zwischenwert = a;
        }
        if (n > 0 && a > 0) {
            zwischenwert = (berechneWurzel(n - 1, a) + a / berechneWurzel(n - 1, a)) / 2;
        }
        return zwischenwert;
    }

    public int[] berechneDreieckszahlen(int n) {
        if (n < 0) {
            return null;
        }
        int[] array = new int[n];
        array[0] = 0;
        for (int i = 1; i < n; i++) {
            array[i] = array[i - 1] + i;
        }
        return array;
    }
}
