public class Main {

    // Früher:
    // ausspielen(Karte karte)
    // Heute (OOP):
    // karte.ausspielen();

    public static void main(String[] args) {
        Karte karte1 = new Karte(8, "grün");
        Karte karte2 = new Karte(7, "rot");

        karte1.ausspielen(); // <- typische Anwendung, Nutzung der Methoden
        karte2.ziehen();
        //System.out.println(karte1);

        System.out.println(karte2.farbe);
        karte2.wert = 8;                    // <- macht das Sinn? Ist es erlaubt???
        karte2.ausspielen();
    }
}
