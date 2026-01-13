public class DocumentPrint {
    public void afficherDocument(Document doc) {
        System.out.println("\n--- " + doc.getType() + " ---");
        System.out.println("Date : " + doc.getDate());
        System.out.println(doc.getInfosSupplementaires());
        System.out.println("Montant HT : " + doc.getMontantHT());
        System.out.println("TVA : " + doc.getTva());
        System.out.println("Total TTC : " + doc.getTotalTTC());
    }
}
