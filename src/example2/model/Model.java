package example2.model;

import java.util.Random;

public class Model {

    public void run(int a) {
        Random rand = new Random();
        int b = rand.nextInt(2);
        if (a == 1 || a == 0) {
            if (b == 1) {
                System.out.println("Wypadł orzeł");
            } else {
                System.out.println("Wypadła reszka");
            }
            if (a == 1 && a == b) {
                System.out.println("Brawo, wypadł orzeł wygrywasz");
            } else if (a == 1) {
                System.out.println("Wypadła reszka, przegrywasz");
            } else if (a == b) {
                System.out.println("Brawo wypadła reszka wygrywasz");
            } else {
                System.out.println("Wypasł orzeł przegrywasz");
            }

        } else {
            System.out.println("Wprowadzono niepoprawną wartość");
        }


    }
}
