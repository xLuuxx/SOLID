public class StudentClient implements Client {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.9;
    }

    @Override
    public String getType() {
        return "Étudiant";
    }
}
