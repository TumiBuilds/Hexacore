public class Passenger{
    
    //passenger fields 
    
    private String name;
    private String ticketNumber;
    private String destination;
    
    // constructor to set passenger fields
    
    public Passenger(String name ,String ticketNumber ,String destination){
        this.name = name;
        this.ticketNumber = ticketNumber;
        this.destination = destination;
    }
    
   // getters to access private passenger fields 
    
    public String getName(){
        return name;
    }
    public String getTicketNumber(){
        return ticketNumber;
    }
    public String getDestination(){
        return destination;
    }
    

    // displays passenger fields
    @Override
    public String toString(){
        return "Passenger: "+name+ ", Ticket: "+ticketNumber+ ", Destination: "+destination;
    }
}
