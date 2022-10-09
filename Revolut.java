package src.test;
import java.util.Scanner;

public class Revolut {


   public static double RevolutToPln() {
      Scanner scanner = new Scanner(System.in);
      double price = GetDataPL.getCena();
      System.out.println("Podaj Kwotę do wymiany");
      double ammount = scanner.nextDouble();
      double reward = ammount * price;
      System.out.println("Twoja kwota na PLN to: " + reward);
      return reward;
   }

   public static double RevolutFromPln() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Podaj Kwotę do wymiany");
      double ammount = scanner.nextDouble();
      double price = GetDataPL.getCena();
      double reward3 = ammount / price;
      String CurrencyCode = ApiTest.Currency;
      System.out.println("Twoja kwota na " + " to: " + reward3);
      return reward3;
   }
}
