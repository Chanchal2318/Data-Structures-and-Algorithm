import java.util.*;

public class CelebrityProblemO {
    public static int celebrity(int mat[][], int n) {
        int top = 0, down = n - 1;

        // Step 1: Find the celebrity candidate
        while (top < down) {
            if (mat[top][down] == 1) {
                top++; // top knows down, so top cannot be the celebrity
            } else {
                down--; // down cannot be the celebrity as top does not know down
            }
        }

        // The remaining candidate is in `top`
        int candidate = top;

        // Step 2: Verify the candidate
        for (int i = 0; i < n; i++) {
            if (i != candidate) {
                // Candidate should not know anyone and everyone should know the candidate
                if (mat[candidate][i] == 1 || mat[i][candidate] == 0) {
                    return -1; // No celebrity found
                }
            }
        }

        return candidate; // Found the celebrity
    }

    public static void main(String[] args) {
        int n = 4;
        int mat[][] = {
            {0, 1, 0, 0},
            {0, 0, 0, 0},
            {0, 1, 0, 0},
            {0, 1, 0, 0}
        };
        System.out.println("Celebrity index: " + celebrity(mat, n));
    }
}
