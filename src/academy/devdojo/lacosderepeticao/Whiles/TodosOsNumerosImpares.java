package academy.devdojo.lacosderepeticao.Whiles;

import java.util.Scanner;

public class TodosOsNumerosImpares {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite até que numero gostaria de descobrir os impares: ");
        int finalNumber = input.nextInt();

        System.out.println("Os numeros Impares de 0 até " + finalNumber + ":");

        int counter = 0;

        while (counter <= finalNumber) {
            boolean isOdd = counter % 2 != 0;
            if (isOdd) {
                System.out.println(counter);
            }
            counter++;
        }
        input.close();
    }
}
