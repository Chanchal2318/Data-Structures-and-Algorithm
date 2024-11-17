import java.util.*;
public class CirculatTour {
    public static int findStartingPoint(int [] petrol , int [] distance,int n){
        int totalPetrol = 0;
        int totalDistance = 0;
        int currBalance = 0 ;
        int startPoint = 0;
        for(int i = 0;i<n;i++){
            totalPetrol+= petrol[i];
            totalDistance+= distance[i];
            currBalance+= petrol[i] - distance[i];
            if(currBalance < 0){
                startPoint++;
                currBalance = 0;
            }
        }
        if(totalPetrol < totalDistance){
            return -1;
        }
        return startPoint;
    }
    
    public static void main(String[] args) {
        int n = 4;
        int petrol [] = {4,6,7,4};
        int distance[] = {6,5,3,5};
        System.out.println(findStartingPoint(petrol,distance,n));;
    }
}
