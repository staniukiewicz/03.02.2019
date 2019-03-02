package Statyczne;

public class StatycznePrzyklad {

    public static void main(String[] args) {
        Towar dalmierz = new Towar("dalmierz");
        Towar wiertarka = new Towar("wiertarka");
        Towar bruzdownica = new Towar("bruzdownica");
        Towar[] listaTowarow = {dalmierz, wiertarka, bruzdownica};
        for(Towar towar: listaTowarow) {
            System.out.printf("Towar : %s ma id : %d\n",
                    towar.podajNazwe(), towar.podajId());
        }
        System.out.println(Towar.liczbaTowarow);
    }

}

class Towar {
    static int liczbaTowarow;
    private int id = ++liczbaTowarow;
    private String nazwa;

    Towar(String nazwa) {
        this.nazwa = nazwa;
    }

    public int podajId() {
        return this.id;
    }

    public String podajNazwe() {
        return this.nazwa;
    }

}


