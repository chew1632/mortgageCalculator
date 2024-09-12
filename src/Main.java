import java.awt.*;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEARS = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal:");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate:");
        float interestRate = scanner.nextFloat();
        float monthlyInterest = interestRate / PERCENT / MONTHS_IN_YEARS;

        System.out.print("Period:");
        byte period = scanner.nextByte();
        int numberOfPayments = period * MONTHS_IN_YEARS;

        double mortgage = principal *
                (monthlyInterest * Math.pow(1+monthlyInterest,numberOfPayments))
                /(Math.pow(1+monthlyInterest,numberOfPayments)-1);

                String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+mortgageFormatted);
    }
}