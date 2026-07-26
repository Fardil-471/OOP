import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();

        double increaseRate;

        if (salary <= 400.00) {
            increaseRate = 15;
        } 
        else if (salary <= 800.00) {
            increaseRate = 12;
        } 
        else if (salary <= 1200.00) {
            increaseRate = 10;
        } 
        else if (salary <= 2000.00) {
            increaseRate = 7;
        } 
        else {
            increaseRate = 4;
        }

        double increase = salary * increaseRate / 100;
        double newSalary = salary + increase;

        System.out.printf("Novo salario: %.2f\n", newSalary);
        System.out.printf("Reajuste ganho: %.2f\n", increase);
        System.out.printf("Em percentual: %.0f %%\n", increaseRate);

        sc.close();
    }
}