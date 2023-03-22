public class Karte {
    // Attribute müssen private sein!!!
    private final int wert;
    private final String farbe;
    private final String format;
    private static int anzahlKarten = 0;

    // klassicher Konstruktor, der alle Attribute initialisiert!
    // (mit Hilfe der Parameter)
    public Karte(int wert, String farbe, String format) {
        this.wert = wert;
        this.farbe = farbe;
        this.format = format;
        anzahlKarten++;
    }

    public Karte(int wert, String farbe) {
        this(wert, farbe, "standard");
    }

    public static int getAnzahlKarten() {
        return anzahlKarten;
    }

    public String getFarbe() {  // <- Getter!
        return farbe;
    }

    public int getWert() {
        return wert;
    }

    // Methoden
    public void ziehen() {
        System.out.println("Eine Karte wurde gezogen.");
    }

    public void ausspielen() {
        System.out.println("Spiele " + farbe + wert);
    }
}
