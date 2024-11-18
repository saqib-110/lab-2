package Lab4;
public class Refund {
    private float amount;
    private String customerId;

    // Constructor
    public Refund(float amount, String customerId) {
        this.amount = amount;
        this.customerId = customerId;
    }

    // Method
    public void refundAmount() {
        System.out.println("Refunding amount: " + amount + " to customer ID: " + customerId);
    }
}
