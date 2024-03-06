package academy.devdojo.estruturascondicionais.switchcase;

import java.util.Scanner;

public class VerificarJurosDaConta {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tipo da conta que gostaria de saber o juros: 1 - Conta poupança, 2 - Conta corrente, 3 - Conta Investimento");
        int userResponse = input.nextInt();
        double tax;

        switch (userResponse) {
            case 1:
                tax = 0.05;
                System.out.println("Conta Poupança tem o juros de " + tax + "%");
                break;
            case 2:
                tax = 0.02;
                System.out.println("Conta Corrente tem o juros de " + tax + "%");
                break;
            case 3:
                tax = 0.1;
                System.out.println("Conta Investimento tem o juros de " + tax + "%");
                break;
            default:
                System.out.println("Opçao inválida!");
        }

        input.close();
    }
}
