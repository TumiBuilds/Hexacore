public class Searcher{
    
    public static int linearSearch(Bus[] buses, String routeNumber){
        for(int i = 0; i < buses.length; i++){
            if(buses[i].getRouteNumber().equals(routeNumber)){
                return i;
            }
        }
        return  -1;
    }
    public static int binarySearch(Bus[] buses, int targetCapacity){
        int left = 0, right = buses.length -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if (buses[mid].getCapacity() == targetCapacity){
                return mid;
            }
            if (buses[mid].getCapacity() < targetCapacity){
                return mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    } 
}