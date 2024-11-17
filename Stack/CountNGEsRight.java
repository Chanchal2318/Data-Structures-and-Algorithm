package Stack;
import java.util.*;

public class CountNGEsRight {
    
    // Function to get the count of next greater elements to the right for each query index
    public static List<Integer> findNGEs(int[] arr, int[] indices) {
        List<Integer> result = new ArrayList<>();
        
        // Loop through each index in the queries (using the indices array)
        for (int i = 0; i < indices.length; i++) {
            int index = indices[i];  // Get the actual index from indices array
            int count = 0;
            // Loop through the elements to the right of the current index
            for (int j = index + 1; j < arr.length; j++) {
                if (arr[j] > arr[index]) {
                    count++;
                }
            }
            // Add the count to the result list
            result.add(count);
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Example input
        int[] arr = {3, 4, 2, 7, 5, 8, 10, 6};
        int[] indices = {0, 5};
        
        // Get the result of NGEs for the given queries
        List<Integer> result = findNGEs(arr, indices);
        
        // Output the result
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
        }
    }
