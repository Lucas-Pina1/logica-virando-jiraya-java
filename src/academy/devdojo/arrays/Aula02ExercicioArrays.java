package academy.devdojo.arrays;

import java.util.Scanner;

public class Aula02ExercicioArrays {

    public static void main(String[] args) {
        int[] arrayNumbers01 = new int[3];
        int[] arrayNumbers02 = new int[3];
        int[] arrayResults = new int[3];

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arrayNumbers01.length; i++) {
            System.out.println("Vetor 1, posição " + i + ": ");
            arrayNumbers01[i] = input.nextInt();
        }

        for (int i = 0; i < arrayNumbers02.length; i++) {
            System.out.println("Vetor 2, posição " + i + ": ");
            arrayNumbers02[i] = input.nextInt();
        }

        System.out.println("Vetor 3 : Resultado da multiplcação dos indices dos vetores 1 e 2:");

        for (int i = 0; i < arrayResults.length; i++) {
            arrayResults[i] = arrayNumbers01[i] * arrayNumbers02[i];
            System.out.print(arrayResults[i] + " ");
        }
        input.close();
    }
}
