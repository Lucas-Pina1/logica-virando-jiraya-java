import java.util.Scanner;

public class RecebendoDadosDoTeclado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = teclado.next();
        System.out.println("O nome digitado foi: " + nome);

        teclado.close();
    }
}
