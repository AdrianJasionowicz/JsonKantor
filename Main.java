package src.test;
import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shouldEnd = true;

        while (shouldEnd) {
            System.out.println("Wybierz Opcje");
            System.out.println("1. Wyswietl Liste Walut ");
            System.out.println("2 Wymien Walute Obca na Pln");
            System.out.println("3 Wymien Pln na Walute Obca");
            System.out.println("4 Wpłac Pieniadze");
            System.out.println("5 wyjscie");
            int useChoice = scanner.nextInt();
            switch (useChoice) {
                case 1:
                    System.out.println("Wybrano 1");
                    Table.Tablet();
                    break;
                case 2:
                    System.out.println("Wybrano 2");
                    Revolut.RevolutToPln();
                    break;
                case 3:
                    System.out.println("Wybrano 3");
                    Revolut.RevolutFromPln();
                    break;
                case 4:
                    System.out.println("Wybrano 4");

                    break;
                case 5:
                    shouldEnd = false;
            }
        }
    }
}


