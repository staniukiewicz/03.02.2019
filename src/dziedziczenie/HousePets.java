package dziedziczenie;

public class HousePets {

    public static void main(String[] args) {

        Pies pies = new Pies("Burek");
        Kaganiec kaganiec = new Kaganiec("skóra");
        pies.zalozKaganiec(kaganiec);
        Kot kot = new Kot("Rudy");
        Zwierzak[] zwierzeta = {pies, kot};
        for(Zwierzak z: zwierzeta) {
            System.out.printf("%s %s: ", z.getClass().getName(), z.podajImie());
            z.wydajDzwiek();
            Kaganiec k = z.podajKaganiec();
            System.out.println("Czy " + z.podajImie() + " nosi kaganiec?");
            if (k == null) {
                System.out.println(z.getClass().getName() + " przecież nie nosi kagańca!");
            } else {
                System.out.println("Tak, jego materiał to: " + k.getMaterial());
            }
        }

    }

}

abstract class Zwierzak {

    Kaganiec kaganiec;
    private String imie;

    Zwierzak(String imie) {
        this.imie = imie;
    }

    public abstract void wydajDzwiek();

    public String podajImie() {
        return this.imie;
    }

    public void zalozKaganiec(Kaganiec kag) {
        this.kaganiec = kag;
    }

    public Kaganiec podajKaganiec() {
        return this.kaganiec;
    }

}

class Pies extends Zwierzak{

    Pies(String imie) {
        super(imie);
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("Woof!");
    }

}

class Kot extends Zwierzak{

    Kot(String imie) {
        super(imie);
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("KSZZ!");
    }

}

class Kaganiec {

    private String material;

    Kaganiec(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return this.material;
    }

}