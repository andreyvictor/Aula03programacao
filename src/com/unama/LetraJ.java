package com.unama;

import java.util.Scanner;

public class LetraJ {
    public static void main(String args[])
    {
        double dolar;
        double real;
        double valorFinal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor em reais dísponivel para compra de dolares: ");
        real = scanner.nextDouble();
        System.out.println("Informe o valor da cotação do dólar: ");
        dolar = scanner.nextDouble();
        valorFinal = real/dolar;
        System.out.println("O valor de doláres que você pode comprar é: " +valorFinal);
    }
}
