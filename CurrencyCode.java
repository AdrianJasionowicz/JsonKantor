package src.test;
import java.util.Scanner;

public class CurrencyCode {

    public static String askCurrency() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz Walute na Ktora chcesz dokonać wymiany ");
        return scanner.next().toUpperCase();
    }



}
