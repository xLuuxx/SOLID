import java.time.LocalDate;

public class Document {
    protected double montantHT;
    protected double tva;
    protected double totalTTC;
    protected LocalDate date;

    public Document(double montantHT) {
        this.montantHT = montantHT;
        this.date = LocalDate.now();
        calculerTaxes();
    }


    private void calculerTaxes() {
        this.tva = montantHT * 0.2;
        this.totalTTC = montantHT + tva;
    }

    public String getType() {
        return null;
    }

    public String getInfosSupplementaires() {
        return null;
    }

    // Getters
    public double getMontantHT() {
        return montantHT;
    }

    public double getTva() {
        return tva;
    }

    public double getTotalTTC() {
        return totalTTC;
    }

    public LocalDate getDate() {
        return date;
    }
}
