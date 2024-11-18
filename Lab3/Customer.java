package Lab4;
public class Customer {
    private String custId;
    private String name;
    private String address;
    private int phNo;
    private int age;

    // Constructor
    public Customer(String custId, String name, String address, int phNo, int age) {
        this.custId = custId;
        this.name = name;
        this.address = address;
        this.phNo = phNo;
        this.age = age;
    }

    // Methods
    public void addDetails() {
        System.out.println("Details added for customer: " + name);
    }

    public void modifyDetails() {
        System.out.println("Details modified for customer: " + name);
    }

    // Getters and Setters
    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }
}
