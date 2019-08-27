package com.unama;

import java.util.Scanner;

public class LetraH {
    public static void main(String args[])
    {
        double salario;
        double reajuste;
        double valorReajustado;

        Scanner scanner = new Scanner (System.in);
        System.out.println("Informe o valor do seu salário: ");
        salario = scanner.nextDouble();
        System.out.println("Informe o valor do seu reajuste, um numero entre 0 e 1, por exemplo: Se seu reajuste for 10% digite 0,1");
        reajuste = scanner.nextDouble();
        valorReajustado = salario+(salario*reajuste);
        System.out.println("O seu salario somado com seu reajuste é: " +valorReajustado);
    }
}
