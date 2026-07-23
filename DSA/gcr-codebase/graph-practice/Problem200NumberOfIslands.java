import java.util.LinkedList;
import java.util.Queue;

public class Problem200NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        int islands = 0;
        boolean[][] visited = new boolean[rows][cols];
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    islands++;
                    Queue<int[]> queue = new LinkedList<>();
                    queue.add(new int[]{i, j});
                    visited[i][j] = true;

                    while (!queue.isEmpty()) {
                        int[] cell = queue.poll();
                        for (int[] d : directions) {
                            int ni = cell[0] + d[0];
                            int nj = cell[1] + d[1];
                            if (ni >= 0 && ni < rows && nj >= 0 && nj < cols
                                    && !visited[ni][nj] && grid[ni][nj] == '1') {
                                visited[ni][nj] = true;
                                queue.add(new int[]{ni, nj});
                            }
                        }
                    }
                }
            }
        }

        return islands;
    }
}
