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
public class Aufgabe5 {

    public void pow(long x, int y) {
        if (y < 0) {
            System.out.println("ungültig");
        } else {
            long erg = 1;
            while (y > 0) {
                erg = erg * x;
                y--;
            }
            System.out.println("erg = " + erg);
        }
    }

}
