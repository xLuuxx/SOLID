public class CompteBancaire {
    protected double solde = 100;

    public double getSolde() {
        return solde;
    }

    public void afficherSolde() {
        System.out.println("Solde actuel : " + solde + " €");
    }
}
