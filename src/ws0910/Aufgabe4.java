/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws0910;

/**
 *
 * @author Gösta Ostendorf <goesta.o@gmail.com>
 */
public class Aufgabe4 {

//    g(0) = 3
//            3 · g(n − 1) + 1 wenn g(n − 1) ungerade
//    g(n) =
//            g(n − 1)/2 sonst
    public int berechne(int n) {

        if (n == 0) {
            return 3;
        }

        if (berechne(n - 1) % 2 != 0) {
            return 3 * berechne(n - 1) + 1;
        }
        return berechne(n - 1) / 2;

    }

    public int[] invertiere(int[] binZahl) {

        if (binZahl == null || binZahl.length == 0) {
            throw new IllegalArgumentException("Eingabe ungültig!");
        }

        for (int i = 0; i < binZahl.length - 1; i++) {
            if (binZahl[i] > 1 || binZahl[i] < 0) {
                throw new IllegalArgumentException(i + " ist keine binäre Zahl");
            }
            if (binZahl[i] == 0) {
                binZahl[i] = 1;
                continue;
            }
            if (binZahl[i] == 1) {
                binZahl[i] = 0;
               
            }
        }
        return binZahl;

    }

}
