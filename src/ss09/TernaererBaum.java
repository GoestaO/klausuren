/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ss09;

/**
 *
 * @author goesta
 */
public class TernaererBaum {

    private TernaererKnoten wurzel;

    public TernaererBaum(TernaererKnoten wurzel) {
        this.wurzel = wurzel;
    }

// Platz für die Methode liefereWurzel() 
    public TernaererKnoten liefereWurzel() {
        return this.wurzel;
    }

// Platz für die Methode istEnthalten (...) und Hilfsmethoden
    public boolean istEnthalten(int w) {
        return istEnthalten(wurzel, w);
    }

    private boolean istEnthalten(TernaererKnoten t, int w) {

        if (t.liefereWert() == w) {
            return true;
        }
        return (istEnthalten(t.liefereLinkenNachfolger(), w) || istEnthalten(t.liefereMittlerenNachfolger(), w) || istEnthalten(t.liefereRechtenNachfolger(), w));
    }

}
