public class Karte {
    // Attribute
    public int wert;
    public String farbe;
    public String format = "standard";

    // Konstruktor
    public /* kein Datentyp */ Karte() { //<- eher untypischer Konstruktor
        System.out.println("Eine Karte wurde erzeugt!");
    }

    // klassicher Konstruktor, der alle Attribute initialisiert!
    // (mit Hilfe der Parameter)
    public Karte(int neuerWert, String neueFarbe, String neuesFormat) {
        wert = neuerWert;
        farbe = neueFarbe;
        format = neuesFormat;
    }

    public Karte(int neuerWert, String neueFarbe) {
        wert = neuerWert;
        farbe = neueFarbe;
    }


    // Methoden
    public void ziehen() {
        System.out.println("Eine Karte wurde gezogen.");
    }

    public void ausspielen() {
        System.out.println("Spiele " + farbe + wert);
    }
}
