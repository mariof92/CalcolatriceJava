package Calcolatrice;

import java.util.Scanner;

public class CalcolatriceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Benvenuto nella calcolatrice");
        System.out.println("1 - Somma");
        System.out.println("2 - Sottrazione");
        System.out.println("3 - Moltiplicazione");
        System.out.println("4 - Divisione");
        System.out.println("0 - Esci dal programma");

        System.out.println("Scegli un opzione");
        int scelta = scanner.nextInt();

        switch (scelta) {
            case 1:
                System.out.println("Hai scelto la somma");
                System.out.println("Inserisci due numeri interi");
                int n1 = scanner.nextInt();
                int n2 = scanner.nextInt();
                int somma = n1 + n2;
                System.out.println("La somma dei due numeri è: " + somma);
                break;
            case 2:
                System.out.println("Hai scelto la sottrazione");
                System.out.println("Inserisci due numeri interi");
                int n3 = scanner.nextInt();
                int n4 = scanner.nextInt();
                int differenza = n3 - n4;
                System.out.println("La differenza tra i due numeri è: " + differenza);
                break;
            case 3:
                System.out.println("Hai scelto la moltiplicazione");
                System.out.println("Inserisci due numeri interi");
                int n5 = scanner.nextInt();
                int n6 = scanner.nextInt();
                int prodotto = n5 * n6;
                System.out.println("Il prodotto dei due numeri è: " + prodotto);
                break;
            case 4:
                System.out.println("Hai scelto la divisione");
                System.out.println("Inserisci due numeri interi");
                int n7 = scanner.nextInt();
                int n8 = scanner.nextInt();
                if (n8 == 0) {
                    System.out.println("Non puoi dividere per 0");
                } else {
                    int quoziente = n7 / n8;
                    System.out.println("Il quoziente tra i due numeri è: " + quoziente);
                }
                break;
            case 0:
                System.out.println("Uscita");
                break;
            default:
                System.out.println("Scelta non disponibile");
        }

        scanner.close();
    }
}
