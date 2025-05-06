import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompunded;
        int years;
        double amount;

        System.out.print("Enter principal: ");
        principal = scanner.nextDouble();
        System.out.print("Enter the interest rate(in % form): ");
        rate = scanner.nextDouble() / 100;
        System.out.print("Enter the # of times compunded per year: ");
        timesCompunded = scanner.nextInt();
        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompunded, timesCompunded * years);

        System.out.printf("The amount after %d years is $%.2f", years, amount);

        scanner.close();
    }
}