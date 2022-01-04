package lesson;

import java.util.Scanner;

public class inOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Sój wiek:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Wprowadź swoje Imię:");
        String firstName = scanner.nextLine();
        System.out.println("Wprowadź swoje Nazwisko:");
        String lastName = scanner.nextLine();


        System.out.println("Cześć " + firstName + " " + lastName);
        System.out.println("masz już " + age + " lat");
    }
}
