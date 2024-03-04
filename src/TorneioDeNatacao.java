import java.util.Scanner;

public class TorneioDeNatacao {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite o nome do competidor: ");
        String name = keyboard.next();
        System.out.println("Digite a idade do competidor: ");
        int age = keyboard.nextInt();

        if (age <= 10) {
            System.out.println(name + " participará da categoria Infantil");
        } else if (age >= 11 && age <= 15) {
            System.out.println(name + " participará da categoria Juvenil");
        } else if (age >= 16 && age <= 19) {
            System.out.println(name + " participará da categoria Pré-adulto");
        } else {
            System.out.println(name + " participará da categoria Adulto");
        }
    }
}
