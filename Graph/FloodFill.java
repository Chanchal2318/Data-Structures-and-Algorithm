import java.util.*;
public class FloodFill {
    public int[][] helper(int [][] image, int sr, int sc, int color,boolean vis[][],int orgCol){
        //left
        helper(image,sr,sc-1,vis,orgCol);
        // right
        helper(image,sr,sc+1,vis,orgCol);
        //up
        helper(image,sr-1,sc,vis,orgCol);
        //down
        helper(image,sr+1,sc,vis,orgCol);
    }
    public int[][] floodFill(int [][] image, int sr, int sc, int color){
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis,image[sr][sc]);
        return image;
    }
    public static void main(String[] args) {
      
    }
}
