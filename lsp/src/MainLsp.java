import java.util.Scanner;

public class MainLsp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- TYPE DE COMPTE ---");
        System.out.println("1. Compte courant");
        System.out.println("2. PEL");
        System.out.print("Choix : ");

        int choix = lireEntier(scanner);

        if (choix == 1) {
            CompteCourant compte = new CompteCourant();
            compte.afficherSolde();


        System.out.print("Montant à retirer : ");
        double montant = lireDouble(scanner);

        compte.retirer(montant);

        } else if (choix == 2) {
        PEL pel = new PEL();
        pel.afficherSolde();

        System.out.println("Le PEL ne permet pas de retrait.");
        System.out.println("Taux d'intérêt : " + (pel.getTauxInteret() * 100) + "%");

        System.out.print("Voulez-vous calculer les intérêts ? (o/n) : ");
        String reponse = scanner.nextLine().trim().toLowerCase();

        if (reponse.equals("o")) {
            pel.calculerInterets();
        }
    }

        scanner.close();
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

    private static double lireDouble(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrée invalide : ");
            }
        }
    }
}
