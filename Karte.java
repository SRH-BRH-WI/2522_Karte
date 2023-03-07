public class Karte {
    // Attribute müssen private sein!!!
    private int wert;
    private String farbe;
    private String format = "standard";

    // Konstruktor
    public /* kein Datentyp */ Karte() { //<- eher untypischer Konstruktor
        this(0, "schwarz");
        System.out.println("Eine Karte wurde erzeugt!");
    }

    // klassicher Konstruktor, der alle Attribute initialisiert!
    // (mit Hilfe der Parameter)
    public Karte(int wert, String farbe, String format) {
        this.wert = wert;
        this.farbe = farbe;
        this.format = format;
    }

    public Karte(int wert, String farbe) {
        this(wert, farbe, "standard");
    }

    public String getFarbe() {  // <- Getter!
        return farbe;
    }

    public int getWert() {
        return wert;
    }

    public void setWert(int wert) { // <- Setter!
        if (wert >= 0 && wert <= 9)
            this.wert = wert;
    }

    // Methoden
    public void ziehen() {
        System.out.println("Eine Karte wurde gezogen.");
    }

    public void ausspielen() {
        System.out.println("Spiele " + farbe + wert);
    }
}
