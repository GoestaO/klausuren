/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws0910;

import java.util.Arrays;

/**
 *
 * @author Gösta Ostendorf <goesta.o@gmail.com>
 */
public class Main {

    public static void main(String[] args) {
        Aufgabe5 a = new Aufgabe5();
//        int[] binZahl = new int[]{1, 0, 1, 1, 0, 1};
//        int[] invertiert = a.invertiere(binZahl);
//        System.out.println("invertiert = " + Arrays.toString(invertiert));
        a.pow(10, -1);
        a.pow(10, 4);
    }
}
