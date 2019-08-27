package com.unama;

import java.util.Scanner;

public class LetraD {
    public static void main(String args[])
    {
        double raio;
        double perimetro;
        double area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o raio do seu círculo: ");
        raio =  scanner.nextDouble();
        perimetro = 2*Math.PI*raio;
        area = Math.PI*Math.pow(raio,2);
        System.out.println("O perimetro do seu círculo é: " +perimetro + " A area do seu círculo é: " +area);


    }
}
