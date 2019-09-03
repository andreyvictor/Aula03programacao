package com.unama.Aula01;

import java.util.Scanner;

public class LetraC {
    public static void main(String args[])
    {
        double base;
        double altura;
        double area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a altura do seu triangulo: ");
        altura = scanner.nextDouble();
        System.out.println("Informe a base do seu triangulo: ");
        base = scanner.nextDouble();
        area = (altura*base)/2;
        System.out.println("A área do seu triangulo é: "+area);
    }
}
