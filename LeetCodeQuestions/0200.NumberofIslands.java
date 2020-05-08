/*
time complexity: O(n^2)
space complexity: O(1)
thought process: once the site is '1' go to the connected near by sites which is also a '1'
as we visited the '1' then we change '1' to '0', and count that as an island.
*/
class Solution {
    int x;
    int y;
    char[][] g;
    public int numIslands(char[][] grid) {
        g = grid;
        
        int count = 0;
        y = g.length;
        if (y == 0) return 0;
        x = g[0].length;
        
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (g[i][j] == '1') {
                    dfs(i,j);
                    count++;
                }
            }
        }
        
        return count;
    }
    
    private void dfs(int i, int j) {
        // check for invalid indices and for sites that aren't land
        if(i < 0 || j < 0 || i >= y || j >= x || g[i][j] != '1') return;

        // mark the site as visted
        g[i][j] = '0';

        // Check all adajacent sites
        dfs(i + 1, j);
        dfs(i - 1, j);
        dfs(i, j + 1);
        dfs(i, j - 1);
    }
}