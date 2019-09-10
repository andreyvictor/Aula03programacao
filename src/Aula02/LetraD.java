package Aula02;

import java.util.Scanner;

public class LetraD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numero1, numero2, numero3;
        System.out.println("Informe o primeiro número: ");
        numero1=scanner.nextInt();
        System.out.println("Informe o segundo número: ");
        numero2=scanner.nextInt();
        System.out.println("Informe o terceiro número: ");
        numero3=scanner.nextInt();
        if ((numero1 == numero2) && (numero1==numero3)){
            System.out.println("Seu triangulo é Equilátero!");
        }else if (numero1==numero2 || numero1==numero3){
            System.out.println("Seu triangulo é Isósceles!");
        }else{
            System.out.println("Seu triangulo é Escaleno!");
        }

    }
}
