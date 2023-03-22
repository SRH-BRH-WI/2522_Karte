public class Main {

    // Früher:
    // ausspielen(Karte karte)
    // Heute (OOP):
    // karte.ausspielen();

    public static void main(String[] args) {
        System.out.println( Karte.getAnzahlKarten() );

        Karte karte1 = new Karte(8, "grün");
        System.out.println( Karte.getAnzahlKarten() );

        Karte karte2 = new Karte(7, "rot");
        System.out.println( Karte.getAnzahlKarten() );

        Aussetzkarte blauA = new Aussetzkarte("blau");
        blauA.ausspielen(); // soll den Aussetzen-Effekt auslösen!
        System.out.println("blauA hat die Farbe: " + blauA.getFarbe());

        karte1.ausspielen(); // <- typische Anwendung, Nutzung der Methoden
        karte2.ziehen();
        //System.out.println(karte1);

        System.out.println(karte2.getFarbe());
//        karte2.wert = 8;                    // <- macht das Sinn? Ist es erlaubt???
//        karte2.setWert(8);                    // so würde es gehen
        karte2.ausspielen();

        System.out.println( Karte.getAnzahlKarten() );
        System.out.println( Karte.getAnzahlKarten() );
    }
}
