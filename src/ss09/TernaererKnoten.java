
package ss09;

/**
 *
 * @author goesta
 */
public class TernaererKnoten {

    private int wert;
    private TernaererKnoten links;
    private TernaererKnoten mitte;
    private TernaererKnoten rechts;

    public int liefereWert() {
        return wert;
    }

    public TernaererKnoten liefereLinkenNachfolger() {
        return links;
    }

    public TernaererKnoten liefereMittlerenNachfolger() {
        return mitte;
    }

    public TernaererKnoten liefereRechtenNachfolger() {
        return rechts;
    }
    
    
}
