package Aula02;

import java.util.Scanner;

public class LetraC {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner (System.in);
        int idade;
        int categoria;

        System.out.println("Informe sua idade para verificar sua categoria: ");
        idade = scanner.nextInt();
        if(idade<=10){
            System.out.println("Sua categoria é Infantil!");
        }else if (idade>=11&idade<=17){
            System.out.println("Sua categoria é Juvenil");
        }else{
            System.out.println("Sua categoria é Sênior!");
        }
    }
}
