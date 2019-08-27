package com.unama;

import java.util.Scanner;

public class LetraE {
    public static void main(String args[])
    {
        double vendas;
        double comissao;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor total de suas vendas: ");
        vendas = scanner.nextDouble();
        comissao = vendas/10;
        System.out.println("O valor de sua comissão é: " +comissao);
    }
}
