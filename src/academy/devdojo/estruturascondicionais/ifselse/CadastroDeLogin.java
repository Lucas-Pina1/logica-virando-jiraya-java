package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class CadastroDeLogin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o o nome de usuário (login) que deseja cadastrar: ");
        String login = input.next();

        if (login.equals("") || login.equalsIgnoreCase("admin") || login.equalsIgnoreCase("administrador")) {
            System.out.println("Usuário inválido, escolha outro");
        } else {
            System.out.println(login + " cadastrado com sucesso!");
        }

        input.close();
    }
}
