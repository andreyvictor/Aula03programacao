package com.unama.Aula01;

import java.util.Scanner;

public class LetraF {
    public static void main(String args[])
    {
        double preco;
        double quantidade;
        double valorPago;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Informe o preço do produto: ");
        preco = scanner.nextDouble();
        System.out.println("Informe a quantidade a ser comprada: ");
        quantidade = scanner.nextDouble();
        valorPago = preco*quantidade;
        System.out.println("O valor total de sua compra é: " +valorPago);
    }
}
