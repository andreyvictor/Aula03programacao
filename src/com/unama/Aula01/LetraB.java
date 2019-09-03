package com.unama.Aula01;

import java.util.Scanner;

public class LetraB {

    public static void main(String[] args) {
        double numero;
        double dobro;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número: ");
        numero = scanner.nextDouble();
        dobro = numero * 2;
        System.out.println("O dobro do número informado é: "+ dobro);
    }
}
