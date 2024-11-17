import java.util.Stack;

public class TowerofHanoi {
    public static void hanoi(int n) {
        Stack<Integer> tower1 = new Stack<>();
        Stack<Integer> tower2 = new Stack<>();
        Stack<Integer> tower3 = new Stack<>();

        // Initialize the first tower with disks
        for (int i = n; i >= 1; i--) {
            tower1.push(i);
        }

        int totalMoves = (int) Math.pow(2, n) - 1;

        // Move disks between towers
        for (int i = 1; i <= totalMoves; i++) {
            int fromIndex = (i & (i - 1)) % 3; // From tower
            int toIndex = ((i | (i - 1)) + 1) % 3; // To tower
            int auxIndex = 3 - fromIndex - toIndex; // Auxiliary tower

            if (i % 3 == 1) {
                moveDisk(tower1, tower2, fromIndex, toIndex);
            } else if (i % 3 == 2) {
                moveDisk(tower1, tower3, fromIndex, auxIndex);
            } else {
                moveDisk(tower2, tower3, auxIndex, toIndex);
            }
        }
    }

    public static void moveDisk(Stack<Integer> fromTower, Stack<Integer> toTower, int fromIndex, int toIndex) {
        if (fromTower.isEmpty()) {
            int topDisk = toTower.pop();
            fromTower.push(topDisk);
            System.out.println("Move disk " + topDisk + " from Tower " + toIndex + " to Tower " + fromIndex);
        } else if (toTower.isEmpty()) {
            int topDisk = fromTower.pop();
            toTower.push(topDisk);
            System.out.println("Move disk " + topDisk + " from Tower " + fromIndex + " to Tower " + toIndex);
        } else if (fromTower.peek() > toTower.peek()) {
            int topDisk = fromTower.pop();
            fromTower.push(topDisk);
            System.out.println("Move disk " + topDisk + " from Tower " + fromIndex + " to Tower " + toIndex);
        } else {
            int topDisk = toTower.pop();
            toTower.push(topDisk);
            System.out.println("Move disk " + topDisk + " from Tower " + toIndex + " to Tower " + fromIndex);
        }
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        hanoi(n);
    }
}
