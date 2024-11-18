package Lab4;
public class Agent implements CommonFunctions {
    private int id;
    private String name;

    // Constructor
    public Agent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Implementing Interface Methods
    @Override
    public void searchTicket() {
        System.out.println("Agent " + name + " is searching for tickets.");
    }

    @Override
    public void bookTicket() {
        System.out.println("Agent " + name + " is booking tickets.");
    }

    @Override
    public void cancelTicket() {
        System.out.println("Agent " + name + " is canceling tickets.");
    }

    @Override
    public void makePayment() {
        System.out.println("Agent " + name + " is processing payment.");
    }

    @Override
    public void fillDetails() {
        System.out.println("Agent " + name + " is filling in details.");
    }
}
