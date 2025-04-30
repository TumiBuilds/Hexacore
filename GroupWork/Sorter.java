import java.util.Arrays;

public class Sorter{

    // Selection sort: sorts buses by capacity in ascending order
    public static void selectionSort(Bus[] buses){
        int n = buses.length;
        for(int i = 0; i < n - 1; i++){
            int minIndex = i;
            // Find the bus with the smallest capacity in the remaining array
         for(int j = i + 1; j < n; j++){
            if(buses[j].getCapacity() < buses[minIndex].getCapacity()){
               minIndex = j; 
            }
         }
         //Swap current bus with the smallest one found
         Bus temp = buses[minIndex];
         buses[minIndex] = buses[i];
         buses[i] = temp;
        }
    }

    //Insertion sort: sorts buses by current passengers in ascending order
    public static void insertionSort(Bus[] buses){
        int n= buses.length;
        for(int i = 1; i < n; i++){
            Bus key =  buses[i];
            int j = i - 1;
            // Insert the current bus in its correct position
            while(j >= 0 && buses[j].getCurrentPassengers()>key.getCurrentPassengers()){
                buses[j + 1] = buses[j];
                j--;
            }
            buses[j + 1] = key;
        }
    }
}
