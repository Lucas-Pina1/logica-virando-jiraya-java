package academy.devdojo.lacosderepeticao.Fors;

public class Aula03ExercicioForAninhado {

    public static void main(String[] args) {

        System.out.println("Tabuada de 1 a 10: \n");
        for (int i = 1; i <= 10; i++) {
            System.out.println("-----------------------");
            System.out.println("Tabuada do numero " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
        }
    }
}
