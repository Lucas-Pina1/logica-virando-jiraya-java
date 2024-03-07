package academy.devdojo.lacosderepeticao.Whiles;

import java.util.Scanner;

public class Aula04ExercicoLogin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final String login = "Luffy";
        final String password = "ReiDosPiratas";

        boolean showScreenLogin = true;

        while (showScreenLogin) {
            System.out.println("Digite seu login");
            String userEnteredLogin = input.nextLine();

            System.out.println("Digite sua senha");
            String userEnteredPassword = input.nextLine();

            boolean loginCredentials = login.equals(userEnteredLogin) && password.equals(userEnteredPassword);

            if (loginCredentials) {
                System.out.println("ACESSO CONCEDIDO!");
                showScreenLogin = false;
                break;
            }
            System.out.println("ACESSO NEGADO!");
        }
        input.close();
    }
}
