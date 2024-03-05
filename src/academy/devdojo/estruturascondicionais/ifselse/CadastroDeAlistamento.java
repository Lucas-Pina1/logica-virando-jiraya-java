package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class CadastroDeAlistamento {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int age = input.nextInt();
        System.out.println("Digite seu sexo: 'M' para masculino ou 'F' para feminino: ");
        String sex = input.next();

        if (sex.equalsIgnoreCase("M") || sex.equalsIgnoreCase("F")) {
            if (sex.equalsIgnoreCase("M") && age >= 18) {
                System.out.println("Alistamento Obrigatório");
            } else if (sex.equalsIgnoreCase("M") && age < 18) {
                System.out.println("Alistamento não permitido");
            } else if (sex.equalsIgnoreCase("F") && age >= 18) {
                System.out.println("Você deseja se alistar?");
            } else {
                System.out.println("Alistamento não permitido");
            }
        } else {
            System.out.println("sexo invalido! Digite M ou F");
        }
        input.close();
    }
}
