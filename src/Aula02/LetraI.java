package Aula02;

import java.util.Scanner;

public class LetraI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double altura;
        double sexo, pesoIdeal;
        System.out.println("Bem vindo, para calcular seu peso ideal vamos precisar se algumas informações!\n ");
        System.out.println("Primeiramente, informe seu sexo. Digite 1 ou 2 para  masculino e feminino respectivamente: ");
        sexo=scanner.nextDouble();
        System.out.println("Agora informe a sua altura: ");
        altura=scanner.nextDouble();
        if (sexo==1){
            pesoIdeal=72.7*altura-58;
        }else{
            pesoIdeal=62.1*altura-44.7;
        }
        System.out.println("Seu peso ideal é: " +pesoIdeal);
    }
}
