package org.example;

public class Solution {

    /**
     * Calculates the number of islands in the given grid.
     *
     * @param grid The 2D grid of characters.
     * @return The number of islands in the grid.
     */
    public int numIslands(char[][] grid) {
        int result = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        // Iterate through each cell in the grid
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    result++; // Increment the count of islands
                    traversalRecur(grid, i, j); // Perform recursive traversal to mark connected cells as visited
                }
            }
        }

        return result;
    }

    /**
     * Recursive helper method for traversing the grid and marking connected cells as visited.
     *
     * @param grid The 2D grid of characters.
     * @param row  The current row index.
     * @param col  The current column index.
     */
    private void traversalRecur(char[][] grid, int row, int col) {
        int rows = grid.length;
        int cols = grid[0].length;

        // border left,right,up, down
        // already visited or not an island
        if (row < 0 || row >= rows || col < 0 || col >= cols || grid[row][col] == '0') {
            return;
        }

        grid[row][col] = '0'; // Mark visited island by changing its value to '0'


        traversalRecur(grid, row, col - 1); // Left
        traversalRecur(grid, row, col + 1); // Right
        traversalRecur(grid, row - 1, col); // Up
        traversalRecur(grid, row + 1, col); // Down
    }
}
