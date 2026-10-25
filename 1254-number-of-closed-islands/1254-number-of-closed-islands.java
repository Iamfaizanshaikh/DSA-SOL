
class Solution {
    static int[][] direction = {
        {0, -1}, {0, 1}, {-1, 0}, {1, 0}
    };

    int m, n;
    boolean[][] visited;
    boolean isClosed;

    void dfs(int i, int j, int[][] grid) {
        visited[i][j] = true;

        if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
            isClosed = false;
        }

        for (int[] d : direction) {
            int ni = i + d[0];
            int nj = j + d[1];

            if (ni >= 0 && ni < m &&
                nj >= 0 && nj < n &&
                grid[ni][nj] == 0 &&
                !visited[ni][nj]) {

                dfs(ni, nj, grid);
            }
        }
    }

    public int closedIsland(int[][] grid) {
        m = grid.length;
        n = grid[0].length;

        visited = new boolean[m][n];
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 0 && !visited[i][j]) {
                    isClosed = true;

                    dfs(i, j, grid);

                    if (isClosed) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
