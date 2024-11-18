package Lab4;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("C001", "SAQIB HASSAN", "123 Street", 987654321, 25);
        customer.addDetails();
        
        Agent agent = new Agent(101, "Agent Rehman");
        agent.searchTicket();

        Ticket ticket = new Ticket("New York", "Los Angeles", LocalDate.of(2024, 11, 25), LocalTime.of(10, 30), "B123", "A1");
        System.out.println("Ticket booked from " + ticket.getSource() + " to " + ticket.getDestination());

        Refund refund = new Refund(120.50f, "C038");
        refund.refundAmount();

        BookingCounter bookingCounter = new BookingCounter();
        bookingCounter.processBooking();
    }
}
