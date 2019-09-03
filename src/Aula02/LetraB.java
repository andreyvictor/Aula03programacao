package Aula02;

import java.util.Scanner;

public class LetraB {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int pecasProduzidas;
        int pecasBoas;
        int pecasDefeituosas;

        System.out.println("Informe a quantidade de peças produzidas: ");
        pecasProduzidas = scanner.nextInt();
        System.out.println("Informe a quantidade destas peças produzidas que estão boas: ");
        pecasBoas = scanner.nextInt();
        System.out.println("Agora informe quantas estão com algum defeito: ");
        pecasDefeituosas = scanner.nextInt();
        Character necessidadeManutencao;
        if (pecasDefeituosas <= pecasProduzidas * 0.10) {
            System.out.println("Sua máquina não necessita de manutenção!");
        } else {
            System.out.println("Sua máquina necessita de manutenção!");
        }

    }
}
