import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.Solution;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSolution() {
        Solution solution = new Solution();

        char[][] grid1 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        int expected1 = 3;
        int actual1 = solution.numIslands(grid1);
        assertEquals(expected1, actual1);

        char[][] grid2 = {
                {'1', '1', '1'},
                {'0', '0', '0'},
                {'1', '1', '1'}
        };
        int expected2 = 2;
        int actual2 = solution.numIslands(grid2);
        assertEquals(expected2, actual2);

        char[][] grid3 = {
                {'1', '0', '1'},
                {'0', '1', '0'},
                {'1', '0', '1'}
        };
        int expected3 = 5;
        int actual3 = solution.numIslands(grid3);
        assertEquals(expected3, actual3);

        char[][] grid4 = {
                {'1', '1', '1'},
                {'1', '0', '1'},
                {'1', '1', '1'}
        };
        int expected4 = 1;
        int actual4 = solution.numIslands(grid4);
        assertEquals(expected4, actual4);

        char[][] grid5 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '1', '0'},
                {'0', '0', '1', '0', '1'},
                {'0', '0', '0', '1', '1'}
        };
        int expected5 = 4;
        int actual5 = solution.numIslands(grid5);
        assertEquals(expected5, actual5);

        char[][] grid6 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        int expected6 = 1;
        int actual6 = solution.numIslands(grid6);
        assertEquals(expected6, actual6);

        char[][] grid7 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '1', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        int expected7 = 2;
        int actual7 = solution.numIslands(grid7);
        assertEquals(expected7, actual7);

        char[][] grid8 = {
                {'1', '0', '0', '0', '0'},
                {'0', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '0'}
        };
        int expected8 = 4;
        int actual8 = solution.numIslands(grid8);
        assertEquals(expected8, actual8);

        char[][] grid9 = {
                {'1', '0', '1'},
                {'0', '1', '0'},
                {'1', '0', '1'},
                {'0', '1', '0'}
        };
        int expected9 = 6;
        int actual9 = solution.numIslands(grid9);
        assertEquals(expected9, actual9);

        char[][] grid10 = {
                {'1', '1'},
                {'1', '1'},
                {'1', '1'}
        };
        int expected10 = 1;
        int actual10 = solution.numIslands(grid10);
        assertEquals(expected10, actual10);

        System.out.println("All test cases passed.");
    }
}
