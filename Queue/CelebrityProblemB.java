import java.util.*;
public class CelebrityProblemB {
    public static int celebrity(int mat[][],int n){
        int knowMe[] = new int[n];
        int Iknow[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ;j<n ;j++){
                if(mat[i][j] == 1){
                    knowMe[j]++;
                    Iknow[i]++;
                }
            }
        }
        for(int i = 0 ;i < n; i++){
            if(knowMe[i] == n-1 && Iknow[i] == 0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 4;
        int mat[][]= {
            {0,1,0,0},{0,0,0,0},{0,1,0,0},{0,1,0,0}
        };
        System.out.println("Celebrity index: " + celebrity(mat,n));
    }
}
