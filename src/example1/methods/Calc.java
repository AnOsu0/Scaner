package example1.methods;

public class Calc {

    public void calculator(double a, double b, String sign) {
        switch (sign) {
            case "+":
                System.out.println("Wynik dodawania  liczb " + a + " oraz " + b + " to: "
                + add(a,b));
                break;
            case "-":
                System.out.println("Wynik odejmowania  liczb " + a + " oraz " + b + " to: "
                        + minus(a,b));
                break;
            case "*":
                System.out.println("Wynik mnożenia liczb " + a + " oraz " + b + " to: "
                        + multiple(a,b));
                break;
            case "/":
                System.out.println("Wynik dzielenia liczb " + a + " oraz " + b + " to: "
                        + div(a,b));
                break;
            default:
                System.out.println("Niepoprawna wartość");
        }
    }


    private double add(double a, double b) {
        return a + b;
    }
    private double minus(double a, double b) {
        return a - b;
    }
    private double multiple(double a, double b) {
        return a * b;
    }
    private double div(double a, double b) {
        return a / b;
    }
}
