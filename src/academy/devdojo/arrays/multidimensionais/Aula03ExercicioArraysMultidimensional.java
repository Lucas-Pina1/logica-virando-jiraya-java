package academy.devdojo.arrays.multidimensionais;

import java.util.Scanner;

public class Aula03ExercicioArraysMultidimensional {

    public static void main(String[] args) {
        int[][] arrayMult1 = new int[3][3];
        int resultadoMultiplicacaoDiagonalPrincipal = 1;

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arrayMult1.length; i++) {
            for (int j = 0; j < arrayMult1[i].length; j++) {
                System.out.println("Digite o valor da posição [" + i + "] [" + j + "]");
                arrayMult1[i][j] = input.nextInt();
            }
        }

        System.out.println("Sua matriz ficou: ");
        for (int i = 0; i < arrayMult1.length; i++) {
            for (int j = 0; j < arrayMult1[i].length; j++) {
                System.out.print(arrayMult1[i][j] + " ");
                if (arrayMult1[i][j] == arrayMult1[0][2] || (arrayMult1[i][j] == arrayMult1[1][2])) {
                    System.out.println();
                }
            }
        }

        System.out.println();

        for (int i = 0; i < arrayMult1.length; i++) {
            for (int j = 0; j < arrayMult1[i].length; j++) {
                if (i == j) {
                    resultadoMultiplicacaoDiagonalPrincipal *= arrayMult1[i][j];
                }
            }
        }

        System.out.println("A multiplicação de sua diagonal principal é: ");
        System.out.println(resultadoMultiplicacaoDiagonalPrincipal);

        input.close();
    }
}
