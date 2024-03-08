package academy.devdojo.lacosderepeticao.Fors;

public class Aula02Exercicio01 {

    public static void main(String[] args) {
        for (int i = 15; i <= 200; i++) {
            if (Math.sqrt(i) > 0) {
                System.out.println(Math.round(Math.pow(i, 2)));
            }
        }
    }
}
