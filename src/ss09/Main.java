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
public class Main {
    public static void main(String[] args) {
        Aufgabe4 q = new Aufgabe4();
//        System.out.println("q = " + q.berechneWurzel(6, 2));
//        System.out.println("q = " + q.berechneDreieckszahlen(4));
        int[]x = q.berechneDreieckszahlen(6);
        for(int i : x){
            System.out.println("i = " + i);
        }
    }
    
    
    
}
