package Aula02;

import java.util.Scanner;

public class LetraA {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int totalCopias;
        System.out.println("Informe o total de Cópias: ");
        totalCopias = scanner.nextInt();
        double totalPago;
                if(totalCopias<=100){
                    totalPago=totalCopias*0.25;
                }else{
                    totalPago=totalCopias*0.20;
                }
                System.out.println("Total a ser pago é: R$"+totalPago);
    }
}
