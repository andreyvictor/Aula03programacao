package com.unama.Aula01;

import java.util.Scanner;

public class LetraG {
    public static void main(String args[])
    {
        double comprimento;
        double largura;
        double area;

        Scanner scanner = new Scanner (System.in);
        System.out.println("Informe o comprimento de sua sala: ");
        comprimento = scanner.nextDouble();
        System.out.println("Informe a largura de sua sala: ");
        largura = scanner.nextDouble();
        area = comprimento*largura;
        System.out.println("A área de sua sala é: " +area);
    }
}
