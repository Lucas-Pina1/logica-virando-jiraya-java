package academy.devdojo.estruturascondicionais.ifselse;

public class VerificarImparOuPar {

    public static void main(String[] args) {
        int number = 10;

        if ((number % 2) == 0) {
            System.out.println("O numero " + number + " é par");
        } else {
            System.out.println("O numero " + number + " é Impar");
        }
    }
}
