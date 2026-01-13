public class CompteCourant extends CompteBancaire implements CompteAvecRetrait {

    @Override
    public void retirer(double montant) {
        if (montant > solde) {
            System.out.println("Fonds insuffisants pour le retrait de " + montant + " €.");
        } else {
            solde -= montant;
            System.out.println("Retrait de " + montant + " € effectué avec succès.");
            System.out.println("Votre nouveau solde est de : " + solde + " €");
        }
    }
}
