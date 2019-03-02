package POWTORKA;

public class POWTORKA2 {

/*
2. Stwórz klasę portfel. Zastanów się, jakie pola (atrybuty) i operacje powinniśmy móc wykonywać
na portfelu oraz co musimy na jego temat wiedzieć na samym początku (podczas zakupu). Np.
a. Konstruktor (materiał, marka, rozmiar)
    b. Liczba banknotów (**i jakich banknotów)
    c. Miejsca na karty płatnicze (ile miejsc)
    d. Aktualizacja stanu gotówki, itp.
}
 */

    public static void main(String[] args) {

        System.out.println("Kupiłem sobie nowy portfel!");
        Portfel p = new Portfel("M", "Dolce i Gabona", "porządna farbowana skóra");
        System.out.printf("Mam teraz %.2f zł%n", p.podajLiczbePieniedzy());
        System.out.println("Dorzucam 50!");
        p.aktualizujBanknoty("pięćdziesiątka", true);
        System.out.printf("Mam teraz %.2f zł%n", p.podajLiczbePieniedzy());
        System.out.println("Dorzucam 100!");
        p.aktualizujBanknoty("stówka", true);
        System.out.printf("Mam teraz %.2f zł%n", p.podajLiczbePieniedzy());
        System.out.println("Ups, źle zaparkowałem..");
        p.aktualizujBanknoty("stówka", false);
        System.out.printf("Mam teraz %.2f zł%n", p.podajLiczbePieniedzy());
        System.out.println("Dostałem trochę drobniaków od babci");
        p.aktualizujPieniadzeSwobodnie(376.39);
        System.out.printf("Mam teraz %.2f zł%n", p.podajLiczbePieniedzy());
    }

}

class Portfel {

    private String rozmiar;
    private String marka;
    private String material;
    private int liczbaDyszek;
    private int liczbaDwudziestek;
    private int liczbaPiecdziesiatek;
    private int liczbaStowek;
    private int liczbaDwusetek;
    private double totalMoney;

    Portfel(String mrozmiar, String mMarka, String mMaterial) {
        this.rozmiar = mrozmiar;
        this.marka = mMarka;
        this.material = mMaterial;
        this.liczbaDyszek = 0;
        this.liczbaDwudziestek = 0;
        this.liczbaPiecdziesiatek = 0;
        this.liczbaStowek = 0;
        this.liczbaDwusetek = 0;
        this.totalMoney = 0;
    }

    public double podajLiczbePieniedzy() {
        return this.totalMoney;
    }

    public void aktualizujPieniadzeSwobodnie(double kwota) {
        this.totalMoney += kwota;
    }

    public void aktualizujBanknoty(String banknot, boolean dodaj) {
        switch(banknot) {
            case "dyszka":
                if (dodaj) {
                    this.liczbaDyszek += 1;
                    this.totalMoney += 10;
                } else {
                    this.liczbaDyszek -= 1;
                    this.totalMoney -= 10;
                }
                break;
            case "dwudziestka":
                if (dodaj) {
                    this.liczbaDwudziestek += 1;
                    this.totalMoney += 20;
                } else {
                    this.liczbaDwudziestek -= 1;
                    this.totalMoney -= 20;
                }
                break;
            case "pięćdziesiątka":
                if (dodaj) {
                    this.liczbaPiecdziesiatek += 1;
                    this.totalMoney += 50;
                } else {
                    this.liczbaPiecdziesiatek -= 1;
                    this.totalMoney -= 50;
                }
                break;
            case "stówka":
                if (dodaj) {
                    this.liczbaStowek += 1;
                    this.totalMoney += 100;
                } else {
                    this.liczbaStowek -= 1;
                    this.totalMoney -= 100;
                }
                break;
            case "dwusetka":
                if (dodaj) {
                    this.liczbaDwusetek += 1;
                    this.totalMoney += 200;
                } else {
                    this.liczbaDwusetek -= 1;
                    this.totalMoney -= 200;
                }
                break;
            default:
                System.out.println("Chyba się pomyliłeś!");
                break;
        }

    }


}