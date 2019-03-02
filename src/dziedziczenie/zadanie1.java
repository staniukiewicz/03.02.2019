package dziedziczenie;

public class zadanie1 {

    public static void main(String[] args) {

        Jablko jablko = new Jablko();
        jablko.przerobNaSok();
        jablko.zetrzyjNaMus();
        jablko.zetrzyjNaMus("rzadki");

    }

}

class Owoc {

    String witaminy;
    String rodzaj;

    Owoc(String rodzaj, String witaminy, boolean soczysty, boolean moznaJescZeSkorka) {
        this.rodzaj = rodzaj;
        this.witaminy = witaminy;
    }

    void przerobNaSok() {
        System.out.printf("Przerabiamy %s na sok bogaty w witaminy %s\n", this.rodzaj, this.witaminy);
    }

}

class Jablko extends Owoc {

    Jablko() {
        super("Jablko","A,D,E,K,C,B6", true, true);
    }

    void zetrzyjNaMus() {
        System.out.println("Jablko starte na mus");
    }

    void zetrzyjNaMus(String typMusu) {
        System.out.println("Jablko starte na mus : " + typMusu);
    }

}


