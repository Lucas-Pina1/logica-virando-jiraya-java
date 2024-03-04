public class ImpostoDeRenda {

    public static void main(String[] args) {
        double salary = 10850D;
        double incomeTax = 0;

        if (salary <= 1903.98) {
            System.out.println("Isento de imposto!");
        } else if (salary >= 1903.99 && salary <= 2823.65) {
            incomeTax = salary * 0.075;
            System.out.println("7.5% " + incomeTax);
        } else if (salary >= 2823.66 && salary <= 3751.05) {
            incomeTax = salary * 0.15;
            System.out.println("15% " + incomeTax);
        } else if (salary >= 3751.06 && salary <= 4664.68) {
            incomeTax = salary * 0.225;
            System.out.println("22.5% " + incomeTax);
        } else {
            incomeTax = salary * 0.275;
            System.out.println("27.5% " + incomeTax);
        }

    }
}
