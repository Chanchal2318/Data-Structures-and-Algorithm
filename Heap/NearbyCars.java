import java.util.*;
public class NearbyCars {
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int distSq;
        public Pint(int x, int y, int distSq){
            this.x = x;
            this.y = y;
            this.distSq = distSq;
        }
        @Override
        public int compareTo(Point p2){
            return this.distSq - p2.distSq; // ascending order
        }
    }

    public static void main(String[] args) {
        int pts[] = {{3,3},{5,-1},{-2,4}};
        int k = 2;
        PriorityQueue<Point>pq = new PriorityQueue<>();
        for(int i = 0 ; i<pts.length;i++){
            int distSq = pts[i][0]*pts[i][0]

        }
    }
}
