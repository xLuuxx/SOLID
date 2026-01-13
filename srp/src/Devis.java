public class Devis extends Document {
    private static final int day_valid = 30;

    public Devis(double montantHT) {
        super(montantHT);
    }

    @Override
    public String getType() {
        return "DEVIS";
    }

    @Override
    public String getInfosSupplementaires() {
        return "validity=" + day_valid + "days";
    }
}
