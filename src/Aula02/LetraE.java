package Aula02;

import java.util.Scanner;

public class LetraE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeiroNumero;
        int segundoNumero;
        int terceiroNumero;

        System.out.println("Informe o primeiro número: ");
        primeiroNumero = scanner.nextInt();
        System.out.println("Informe o segundo número: ");
        segundoNumero = scanner.nextInt();
        System.out.println("Informe o terceiro número: ");
        terceiroNumero = scanner.nextInt();
        if (primeiroNumero > segundoNumero && primeiroNumero>terceiroNumero && segundoNumero>terceiroNumero){
            System.out.println("A ordem crescente dos números é: " +primeiroNumero +segundoNumero +terceiroNumero);
        }else if (segundoNumero>primeiroNumero && segundoNumero>terceiroNumero && primeiroNumero>terceiroNumero){
            System.out.println("A ordem crescente dos números é: " +segundoNumero +primeiroNumero +terceiroNumero);
        }else if (terceiroNumero>primeiroNumero && terceiroNumero>segundoNumero && primeiroNumero>segundoNumero){
            System.out.println("A ordem crescente dos números é: " +terceiroNumero +primeiroNumero +segundoNumero);
        }else if (primeiroNumero>segundoNumero && primeiroNumero>terceiroNumero && terceiroNumero>segundoNumero){
            System.out.println("A ordem crescente dos números é: " +primeiroNumero +segundoNumero +terceiroNumero);
        }else if (segundoNumero>primeiroNumero && segundoNumero>terceiroNumero && terceiroNumero>primeiroNumero){
            System.out.println("A ordem crescente dos números é: " +segundoNumero +terceiroNumero +primeiroNumero);
        }else if (terceiroNumero>primeiroNumero && terceiroNumero>segundoNumero && segundoNumero>terceiroNumero){
            System.out.println("A ordem crescente dos números é: " +terceiroNumero +segundoNumero +primeiroNumero);
        }

    }
}
