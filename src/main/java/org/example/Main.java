package org.example;

public class Main {
    public static void main(String[] args) {
        Solution tt = new Solution();
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        System.out.println(tt.numIslands(grid));
    }
}