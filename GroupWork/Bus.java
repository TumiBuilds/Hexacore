public class Bus{
    private String routeNumber;
    private int capacity;
    private int currentPassengers;

    public Bus(String routeNumber ,int capacity){
        this.routeNumber =routeNumber;
        this.capacity = capacity;
        this.currentPassengers = 0;
    }
    public String getRouteNumber(){
        return routeNumber;
    }
    public int getCapacity(){
        return capacity;
    }
    public int getCurrentPassengers(){
        return currentPassengers;
    }
    public void addPassenger() throws OverCapacityException {
        if (currentPassengers >= capacity){
            throw new OverCapacityException("Bus is full!No more passengers allowed.");
        }
        currentPassengers ++;
    }
    @Override
    public String toString(){
        return "Bus Route: "+routeNumber+ ", Capacity: "+capacity+ ", Passengers: "+currentPassengers;
    }
}
 class OverCapacityException extends Exception {

    public OverCapacityException(String message){
        super(message);
    }
}