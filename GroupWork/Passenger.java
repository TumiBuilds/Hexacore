public class Passenger{
    private String name;
    private String ticketNumber;
    private String destination;

    public Passenger(String name ,String ticketNumber ,String destination){
        this.name = name;
        this.ticketNumber = ticketNumber;
        this.destination = destination;
    }

    public String getName(){
        return name;
    }
    public String getTicketNumber(){
        return ticketNumber;
    }
    public String getDestination(){
        return destination;
    }
    public String toString(){
        return "Passenger: "+name+ ", Tickect: "+ticketNumber+ ", Destination: "+destination;
    }
}