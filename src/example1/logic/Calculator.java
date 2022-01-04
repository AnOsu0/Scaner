package example1.logic;
import example1.methods.*;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą liczbę: ");
        double a = scanner.nextDouble();
        System.out.println("Wprowadź drugą liczbę: ");
        double b = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Wprowadź znak: ");
        String sign = scanner.nextLine();

        Calc calc = new Calc();
        calc.calculator(a,b,sign);

    }
}
