public class StandardClient implements Client {
    @Override
    public double applyDiscount(double amount) {
        return amount;
    }

    @Override
    public String getType() {
        return "Standard";
    }
}
