package Aula02;

import java.util.Scanner;

public class LetraH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeiroNumero;

        System.out.println("Informe o seu número: ");
        primeiroNumero = scanner.nextInt();

        if (primeiroNumero % 2 == 0){
            System.out.println("Seu número é Par!");
        }else{
            System.out.println("Seu número é ímpar!");
        }

    }
}
