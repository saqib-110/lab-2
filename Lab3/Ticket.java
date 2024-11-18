package Lab4;
import java.time.LocalDate;
import java.time.LocalTime;

public class Ticket {
    private String source;
    private String destination;
    private LocalDate dateOfJourney;
    private LocalTime time;
    private String busNo;
    private String seatNo;

    public Ticket(String source, String destination, LocalDate dateOfJourney, 
    LocalTime time, String busNo, String seatNo) {
        this.source = source;
        this.destination = destination;
        this.dateOfJourney = dateOfJourney;
        this.time = time;
        this.busNo = busNo;
        this.seatNo = seatNo;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}

