package POWTORKA;

public class POWTORKA1marek {  // mamy utworzoną klasę

    /*	1. Stwórz klasę wewnątrz której:
		a. Będzie metoda main
		b. Będą metody dodaj i odejmij
		c. W metodzie main dodaj instrukcję switch-case z możliwością wyboru, czy użytkownik chce coś dodaj, czy odjąć - wywołując wybrane metody
        d. *To, jaką metodę użytkownik chce wykonać, przekaż do programu za pośrednictwem parametrów uruchomieniowych (varargs)
    */

    public static void main(String[] args) {  // podpunkt a - metoda main
        String action;
        if (args.length > 0) { // podpunkt d - przekazujemy operację do wykonania za pośrednictwem varargs
            action = args[0];
        } else { // lub jeśli użytkownik nic nie przekaże - ustawiamy wartość domyślną
            action = "dodaj";
        }
        int a = 10;
        int b = 10;
        switch(action) {  // podpunkt c - instrukcja switch-case do wyboru, co chcemy zrobić
            case "dodaj":
                System.out.println(add(a, b));  // wyświetlamy wynik metody add, czyli to, co metoda add zwróci po przekazaniu jej wartości naszych zmiennych "a" i "b"
                break;
            case "odejmij":
                System.out.println(substract(a, b)); // wyświetlamy wynik metody substract
                break;
            default:
                System.out.println("Nie ma takiej metody");
                break;
        }
    }

    public static int add(int x, int y) { // pudpunkt b - metoda dodaj
        return x + y;
    }

    public static int substract(int x, int y) { // podpunkt b - i metoda odejmij, obie wewnątrz klasy
        return x - y;
    }


}
