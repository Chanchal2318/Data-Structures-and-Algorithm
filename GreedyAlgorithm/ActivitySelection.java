package GreedyAlgorithm;
import java.util.*;
public class ActivitySelection {
    public static void main(String[] args) { //Tc :- O(n )
        int start[] ={1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        // end time basis sorted activities
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>(); // stores the index of taken activities.

        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];
        for(int i=1;i<end.length;i++){
            if(start[i] >= lastEnd){
                // activity select
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("Maximum activities = "+maxAct);
        for(int i =0; i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
