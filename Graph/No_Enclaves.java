import java.util.*;
public class No_Enclaves {
    static class Edge{
        int src,dest;
        public Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }
    int numberOfEnclaves(int [][]grid){
        Queue<Edge> q =new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        int vis[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                //first row,first column,last row, last column
                if(i == 0 || j == 0 || i == n-1 || j == m-1){
                    if(grid[i][j] == 1){
                        q.add(new Edge(i,j));
                        vis[i][j]=1;
                    }
                }
            }
        }
        int delcol[] = {-1,0,1,0};
        int delrow[] = {-1,0,1,0};
        while(!q.isEmpty()){
            
        }

    }
    public static void main(String[] args) {
        
    }
}
