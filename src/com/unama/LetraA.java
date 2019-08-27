package com.unama;

import java.util.Scanner;

public class LetraA {
    public static void main(String args[])
    {
        String nome;
        double idade;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Informe seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Informe sua idade: ");
        idade = scanner.nextDouble();
        System.out.println("Seu nome é: " +nome + " Sua idade é: " +idade);
    }
}
