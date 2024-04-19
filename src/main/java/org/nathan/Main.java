package org.nathan;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome !");
        Calculate calculate = new Calculate();

        int x = 1;
        int y = 2;
        System.out.printf("%s + %s = %s%n", x, y, calculate.plus(1, 2));
    }
}
