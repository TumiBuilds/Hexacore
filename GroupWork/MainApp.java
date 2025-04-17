public class MainApp{
    public static void main(String[] args){
        Bus[] buses = { 
            new Bus("M091" ,50),
            new Bus("N803" ,30),
            new Bus("A200" ,60)
        };
             //Sorting by capacity
        System.out.println("Before Sorting: ");
        for(Bus b : buses) System.out.println(b);

        Sorter.selectionSort(buses);

        System.out.println("\nAfter Sorting by Capacity: ");
        for(Bus b : buses) System.out.println(b);
 
         //Searching for a bus by  route
         String searchRoute = "M091";
         int index = Searcher.linearSearch(buses, searchRoute);
         System.out.println("\nBus found at index: " +index);

         try {
            buses[1].addPassenger();
            System.out.println("\nAdded passenger to: " + buses[1]);
         } catch (OverCapacityException e){
            System.out.println("Error: " + e.getMessage());
         }
    }
}