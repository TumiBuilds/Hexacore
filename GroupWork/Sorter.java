import java.util.Arrays;

public class Sorter{

    public static void selectionSort(Bus[] buses){
        int n = buses.length;
        for(int i = 0; i < n - 1; i++){
            int minIndex = i;
         for(int j = i + 1; j < n; j++){
            if(buses[i].getCapacity() < buses[minIndex].getCapacity()){
               minIndex = j; 
            }
         }
         //Swap
         Bus temp = buses[minIndex];
         buses[minIndex] = buses[i];
         buses[i] = temp;
        }
    }

    public static void insertionSort(Bus[] buses){
        int n= buses.length;
        for(int i = 1; i < n; i++){
            Bus key =  buses[i];
            int j = i - 1;
            while(j >= 0 && buses[j].getCurrentPassengers()>key.getCurrentPassengers()){
                buses[j + 1] = buses[j];
                j--;
            }
            buses[j + 1] = key;
        }
    }
}