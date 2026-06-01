package JAVA.MEDIUM.Graphs;

public class MaxAreaOfIsland {
    //https://leetcode.com/problems/max-area-of-island
    class Solution {
        public int maxAreaOfIsland(int[][] grid) {
            int maxAr = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    maxAr = Math.max(maxAr, arCount(grid, i, j));
                }
            }
            return maxAr;
        }

        private int arCount(int[][] grid, int i, int j) {
            if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0)
                return 0;
            grid[i][j] = 0;
            return 1
                    + arCount(grid, i + 1, j)
                    + arCount(grid, i - 1, j)
                    + arCount(grid, i, j + 1)
                    + arCount(grid, i, j - 1);

        }
    }

}
