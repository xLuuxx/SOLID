public class FacturationService {
    private final DocumentPrint afficheur;
    private final DocumentSave sauvegarde;

    public FacturationService(DocumentPrint afficheur, DocumentSave sauvegarde) {
        this.afficheur = afficheur;
        this.sauvegarde = sauvegarde;
    }

    public void createDevis(double montantHT) {
        Devis devis = new Devis(montantHT);
        afficheur.afficherDocument(devis);
        sauvegarde.sauvegardeDocument(devis);
    }

    public void createFacture(double montantHT, String client) {
        Facture facture = new Facture(montantHT, client);
        afficheur.afficherDocument(facture);
        sauvegarde.sauvegardeDocument(facture);
    }
}