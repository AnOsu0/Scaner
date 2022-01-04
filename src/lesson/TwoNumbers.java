package lesson;

import java.util.Locale;
import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Podaj A: ");
        double a = scanner.nextDouble();
        System.out.println("Podaj B: ");
        double b = scanner.nextDouble();
        scanner.close();

        System.out.println("A + B = " + (a + b));


    }
}
