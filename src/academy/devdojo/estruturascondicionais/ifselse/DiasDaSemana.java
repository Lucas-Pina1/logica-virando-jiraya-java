package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class DiasDaSemana {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 7 para descobrir o dia da semana: ");
        int userResponse = input.nextInt();

        switch (userResponse) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Numero inválido");
        }

        input.close();
    }
}
