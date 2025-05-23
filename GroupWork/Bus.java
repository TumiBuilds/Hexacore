public class Bus{
    
    // bus fields
    
    private String routeNumber;
    private int capacity;
    private int currentPassengers;
    
    // constructor to set the bus fields
    
    public Bus(String routeNumber ,int capacity){
        this.routeNumber =routeNumber;
        this.capacity = capacity;
        this.currentPassengers = 0;
    }
    
    // getters to access the private bus fields
    
    public String getRouteNumber(){
        return routeNumber;
    }
    public int getCapacity(){
        return capacity;
    }
    public int getCurrentPassengers(){
        return currentPassengers;
    }
    
    //method adds passengers
    
    public void addPassenger() throws OverCapacityException {
        if (currentPassengers >= capacity){
            throw new OverCapacityException("Bus is full!No more passengers allowed.");
        }
        currentPassengers ++;
    }
    
    // displays bus fields
    
    @Override
    public String toString(){
        return "Bus Route: "+routeNumber+ ", Capacity: "+capacity+ ", Passengers: "+currentPassengers;
    }
}

//inherits the exception class 

 class OverCapacityException extends Exception {

    public OverCapacityException(String message){
        super(message);
    }
}
