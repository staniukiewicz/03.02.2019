package POWTORKA;

import java.util.Scanner;
/*      Stwórz klasę wewnątrz której:
		a. Będzie metoda main
		b. Będą metody dodaj i odejmij
		c. W metodzie main dodaj instrukcję switch-case z możliwością wyboru,
		czy użytkownik chce coś dodaj, czy odjąć - wywołując wybrane metody
		d. *To, jaką metodę użytkownik chce wykonać, przekaż do programu za
		pośrednictwem parametrów uruchomieniowych (varargs
 */

public class POWTORKA1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        double x = Double.parseDouble(input.nextLine());
        System.out.println("Podaj drugą liczbę: ");
        double y =Double.parseDouble(input.nextLine());
        System.out.println("Wprowadź dodaj lub odejmij");
        String s = input.nextLine();

        switch(s){
            case "dodaj":
                System.out.println(dodaj(x, y));
                break;
            case "odejmij":
                System.out.println(odejmij(x, y));
                break;

        }

    }

    public static double dodaj(double x, double y) {
        return x + y; }

    public static double odejmij(double x, double y) {
        return x - y; }

}