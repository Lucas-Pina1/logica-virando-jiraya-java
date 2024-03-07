package academy.devdojo.lacosderepeticao.Whiles;

import java.util.Scanner;

public class Aula05DoWhiile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int shallWeContinue = 1;

        do {
            System.out.println("PLAYER 1: Digite um número de 1 a 10: ");
            int player1Number = input.nextInt();
            System.out.println("PLAYER 2: Digite um número de 1 a 10: ");
            int player2Number = input.nextInt();

            if ((player1Number == player2Number)) {
                System.out.println("Acertou");
            } else {
                System.out.println("Errou");
            }

            System.out.println("--------------------------------");
            System.out.println("Deseja continuar Jogando ?");
            System.out.println("1. Sim");
            System.out.println("2. Não");
            shallWeContinue = input.nextInt();
        } while (shallWeContinue == 1);

        System.out.println("Programa finalizado!");
        input.close();
    }
}
