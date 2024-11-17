import java.util.*;
public class No_Islands {
    static class Edge{
        int src,dest;
        public Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void bfs(int ro, int co, int vis[][], char grid[][]){
        vis[ro][co] = 1;
        Queue<Edge> q = new LinkedList<>();
        q.add(new Edge(ro,co));
        int n = grid.length;
        int m = grid[0].length;
        while(!q.isEmpty()){
            int row = q.peek().src;
            int col =q.peek().dest;
            q.remove();
            // traverse in the neighbours and mark them if its a land
            for(int delrow = -1;delrow <= 1; delrow++){
                for(int delcol= -1 ; delcol <=1 ; delcol++){
                    int nrow = row+delrow;
                    int ncol = col+delcol;
                    if(nrow >= 0 && nrow <n && ncol >= 0 && ncol < m && grid[nrow][ncol] == '1' && vis[nrow][ncol] == 0){
                        vis[nrow][ncol] = 1;
                        q.add(new Edge(nrow, ncol));
                    }
                }
            }
        }
    }
    public static int numsIsland(char [][]grid){
        int n = grid.length;
        int m = grid[0].length;
        int vis[][] = new int[m][n];
        int cnt = 0;
        for(int i=0;i<n;i++){ //rows
            for(int j=0;j<m;j++){
                if(vis[i][j] == 0 && grid[i][j] == '1'){
                   cnt ++;
                   bfs(i,j,vis,grid);
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        char[][] grid =  {
            {'0', '1', '1', '1', '0', '0', '0'},
            {'0', '0', '1', '1', '0', '1', '0'}
        };
                
       
        System.out.println(numsIsland(grid));
    }
}
