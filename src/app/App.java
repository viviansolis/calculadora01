package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Calculos op = new Calculos();
        Scanner sc = new Scanner(System.in);
        System.out.println("X: ");
        double x = sc.nextDouble();
        System.out.println("Y: ");
        double y = sc.nextDouble();
        System.out.println("La suma es: "+op.suma(x, y));
        System.out.println("La resta es: "+op.resta(x, y));
        System.out.println("La multiplicación es: "+op.multiplicacion(x, y));
        System.out.println("La division es: "+op.division(x, y));
        sc.close();
    }
}