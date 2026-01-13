public class PEL extends CompteBancaire {
    private final double tauxInteret = 0.03;

    public double getTauxInteret() {  // Getter pour accéder au taux
        return tauxInteret;
    }

    public void calculerInterets() {
        double interets = solde * tauxInteret;
        solde += interets;
        System.out.println("Intérêts ajoutés : " + interets + " €. Nouveau solde : " + solde + " €");
    }
}
