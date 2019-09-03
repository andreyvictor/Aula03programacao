package Aula02;

import java.util.Scanner;

public class LetraG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeiroNumero;
        int segundoNumero;

        System.out.println("Informe o primeiro número: ");
        primeiroNumero = scanner.nextInt();
        System.out.println("Informe o segundo número: ");
        segundoNumero = scanner.nextInt();

        if(primeiroNumero>segundoNumero){
            System.out.println("O número maior é: "+primeiroNumero);
        }else{
            System.out.println("O número maior é: "+segundoNumero);
        }
    }
}
