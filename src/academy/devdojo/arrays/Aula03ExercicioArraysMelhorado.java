package academy.devdojo.arrays;

import java.util.Scanner;

public class Aula03ExercicioArraysMelhorado {

    public static void main(String[] args) {
        int[] arrayNumbers01 = new int[3];
        int[] arrayNumbers02 = new int[3];
        int[] arrayResults = new int[3];

        Scanner input = new Scanner(System.in);
        String resultadoMultiplicacaoArrays = "";
        for (int i = 0; i < arrayNumbers01.length; i++) {
            System.out.println("Vetor 1, posição " + i + ": ");
            arrayNumbers01[i] = input.nextInt();

            System.out.println("Vetor 2, posição " + i + ": ");
            arrayNumbers02[i] = input.nextInt();

            arrayResults[i] = arrayNumbers01[i] * arrayNumbers02[i];
            resultadoMultiplicacaoArrays += arrayResults[i] + " ";
        }
        System.out.println(resultadoMultiplicacaoArrays);

        input.close();
    }
}
