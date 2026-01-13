import java.util.Scanner;

public class MainIsp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Imprimer");
            System.out.println("2. Scanner");
            System.out.println("3. Faxer");
            System.out.println("0. Quitter");
            System.out.print("Choix fonctionnalité : ");

            int fonction = lireEntier(scanner);
            if (fonction == 0) {
                System.out.println("Au revoir !");
                break;
            }

            System.out.println("\nChoisir la machine :");
            System.out.println("1. Imprimante simple");
            System.out.println("2. Imprimante multifonction");
            System.out.print("Choix machine : ");

            int machineChoisie = lireEntier(scanner);

            try {
                executerFonction(machineChoisie, fonction);
            } catch (UnsupportedOperationException e) {
                System.out.println("⚠️ Fonctionnalité non supportée par cette machine");
            }
        }

        scanner.close();
    }

    // Une seule méthode executerFonction (supprimer l'autre)
    private static void executerFonction(int machineChoisie, int fonction) {
        if (machineChoisie == 1) {
            // Imprimante simple : seulement print()
            ImprimanteSimple imprimanteSimple = new ImprimanteSimple();
            if (fonction == 1) {
                imprimanteSimple.print();
            } else {
                throw new UnsupportedOperationException();
            }
        } else if (machineChoisie == 2) {
            // Imprimante multifonction : print(), scan(), fax()
            ImprimanteMultifonction multifonction = new ImprimanteMultifonction();
            switch (fonction) {
                case 1: multifonction.print(); break;
                case 2: multifonction.scan(); break;
                case 3: multifonction.fax(); break;
                default: System.out.println("Fonction inconnue");
            }
        } else {
            System.out.println("Machine inconnue");
        }
    }

    private static int lireEntier(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrée invalide : ");
            }
        }
    }
}
