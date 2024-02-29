public class VerificarPorcentagemSalario {

    public static void main(String[] args) {
        double salary = 4700.00;
        double percent;
        double percentSalary;

        if (salary > 4500) {
            percent = 30;
        } else {
            percent = 15;
        }
        percentSalary = salary * (percent / 100);
        System.out.println(percent + "% do salário é: " + percentSalary);

    }
}
