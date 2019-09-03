package com.unama.Aula01;

import java.util.Scanner;

public class LetraI {
    public static void main(String args[])
    {
        double compra;
        double desconto;
        double valorFinal;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Informe o valor total de sua compra: ");
        compra = scanner.nextDouble();
        System.out.println("Informe o valor do desconto, um numero entre 0 e 1, por exemplo: Se o desconto for 15% digite 0,15");
        desconto = scanner.nextDouble();
        valorFinal = compra-(compra*desconto);
        System.out.println("O valor final da sua compra é: " +valorFinal);

    }
}
