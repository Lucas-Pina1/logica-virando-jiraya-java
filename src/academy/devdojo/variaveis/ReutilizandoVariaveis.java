package academy.devdojo.variaveis;

public class ReutilizandoVariaveis {

    public static void main(String[] args) {
        double salary = 2000.0;
        double percent = 30;
        double salaryPercent = salary * (percent / 100);

        System.out.println(percent + "% do salário: " + salary + " R$" + " é: " + salaryPercent + " R$");

        percent = 15;
        salaryPercent = salary * (percent / 100);

        System.out.println(percent + "% do salário: " + salary + " R$" + " é: " + salaryPercent + " R$");

        percent = 5;
        salaryPercent = salary * (percent / 100);

        System.out.println(percent + "% do salário: " + salary + " R$" + " é: " + salaryPercent + " R$");


    }
}
