package academy.devdojo.lacosderepeticao.Whiles;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option = 0;

        while (option != 3) {
            System.out.println("-------- MENU --------");
            System.out.println("1. Calcular Imposto");
            System.out.println("2. Depositar salário");
            System.out.println("3. Sair");
            option = input.nextInt();
        }
        System.out.println("Programa finalizado!");

        input.close();
    }
}
