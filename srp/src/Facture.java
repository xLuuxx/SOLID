public class Facture extends Document {
    private String client;

    public Facture(double montantHT, String nomClient) {
        super(montantHT);
        this.client = client;
    }

    @Override
    public String getType() {
        return "FACTURE";
    }

    @Override
    public String getInfosSupplementaires() {
        return "Client : " + client;
    }

    public String getNomClient() {
        return client;
    }
}
