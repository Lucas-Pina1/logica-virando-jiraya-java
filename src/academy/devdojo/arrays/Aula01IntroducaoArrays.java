package academy.devdojo.arrays;

import java.util.Scanner;

public class Aula01IntroducaoArrays {

    public static void main(String[] args) {

        // Array
        double[] notes = new double[4];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < notes.length; i++) {
            System.out.println("Digite a nota " + (i + 1));
            notes[i] = input.nextDouble();
        }

        double notesSum = 0;
        for (int i = 0; i < notes.length; i++) {
            notesSum = notesSum + notes[i];
            System.out.println("Nota " + (i + 1) + ": " + notes[i]);
        }
        double media = notesSum / notes.length;
        System.out.println("Media das notas: " + media);

        input.close();
    }
}
