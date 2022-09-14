import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        showStartMessage();
        showAlternatives();
        choice = scanner.nextInt();

        if(choice == 1) {
            System.out.println("Hmmmmmm, här fanns bara en vägg..... ");
            showStartOverMessage();

        } else if (choice == 2) {
            System.out.println("Snyggt, ett steg närmare målet!");
            showAlternatives();
            choice = scanner.nextInt();
            if (choice == 1) {
                printCongratulations();
            } else if (choice == 2) {
                System.out.println("Sorry alltså, det här var inte rätt....");
                showStartOverMessage();
            }
        }
    }

    static void showStartMessage() {
        System.out.println("Du ska försöka ta dig ut ur min labyrint nu, lycka till!");
    }
    static void printCongratulations() {
        System.out.println("Grattis, du klarade spelet!");
    }

    static void showAlternatives() {
        System.out.println("Vilken väg vill du gå?");
        System.out.println("1. Höger");
        System.out.println("2. Vänster");
    }

    static void showStartOverMessage() {
        System.out.println("--------- BÖRJA OM! --------------");
    }
}
