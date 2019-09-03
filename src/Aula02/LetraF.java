package Aula02;

import java.util.Scanner;

public class LetraF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int faltas;
        int nota;

        System.out.println("Informe sua nota: ");
        nota = scanner.nextInt();
        System.out.println("Informe sua quantidade de faltas: ");
        faltas = scanner.nextInt();

        if(nota>=6&faltas<=40){
            System.out.println("Você foi aprovado!");
        }else if (nota<=6&faltas>=40){
            System.out.println("Você foi reprovado!");
        }else if (nota<6&faltas<=40){
            System.out.println("Você está de recuperação!");
        }else{
            System.out.println("Você foi reprovado devido suas faltas!");
        }
    }
}

