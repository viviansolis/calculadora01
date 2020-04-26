package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Calculos cal  = new Calculos();
        Scanner sc = new Scanner(System.in);
        System.out.println("X1: ");
        double a = sc.nextDouble();
        System.out.println("X2: ");
        double b = sc.nextDouble();
        System.out.println("La suma es  :"+ cal.suma(a, b));
    }
}