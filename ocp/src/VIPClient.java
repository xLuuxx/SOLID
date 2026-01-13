public class VIPClient implements Client {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.8;
    }

    @Override
    public String getType() {
        return "VIP";
    }
}
