package example2.logic;

import java.util.Scanner;
import example2.model.*;

public class HeadOrTail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź wartość:");
        System.out.println("1 - orzeł");
        System.out.println("0 - reszka");
        int a = scanner.nextInt();
        Model model = new Model();
        model.run(a);



    }
}
