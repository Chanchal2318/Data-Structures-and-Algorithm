import java.util.*;
public class RottenOranges {
    static class Edge{
        int src, dest,time;
        public Edge(int s ,int d, int t){
            this.src = s;
            this.dest = d;
            this.time = t;
        }
    }
    public static int oranges(int [][]grid){
        int n = grid.length;
        int m = grid[0].length;
        Queue<Edge> q = new LinkedList<>();
        int vis[][] =  new int[n][m];
        int cntFresh = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 2){
                    q.add(new Edge(i,j,0));
                    vis[i][j] = 2;
                }
                else{
                    vis[i][j] = 0;
                }
                if(grid[i][j] == 1){
                    cntFresh++;
                }
            }
            int tm=0;
            int drow[] ={-1,0,1,0};
            int dcol[] = {0,1,0,-1};
            int cnt = 0;
            while(!q.isEmpty()){
                int r = q.peek().src;
                int c = q.peek().dest;
                int t = q.peek().time;
                tm = Math.max(tm,t);
                q.remove();
                for(int k=0;k<4;k++){
                    int nrow = r + drow[k];
                    int ncol = c + dcol[k];
                    if(nrow >= 0 && nrow < n && ncol >=0 && ncol < m && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1){
                        q.add(new Edge(nrow,ncol,t+1));
                        vis[nrow][ncol] = 2;
                        cnt++;
                    }
                }
            }
            if(cnt != cntFresh){
                return -1;
            }
        }
        return tm;
    }
    
}
