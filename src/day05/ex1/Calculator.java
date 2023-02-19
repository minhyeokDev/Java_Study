package day05.ex1;

public class Calculator {

    Calculator() {
    }

    int add(int a, int b) {
        return a + b;
    }

    int minus(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }

    double divide(String a, String b) {
        return Double.parseDouble(a) / Double.parseDouble(b);
    }
}
