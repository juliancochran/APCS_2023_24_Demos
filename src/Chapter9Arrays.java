import java.util.Arrays;

/**
 * Created in class on Friday, Jan 05, 2024
 * Chapter 9 arrays demo
 * We started today with a discussion of O-notation
 * Just as a reminder:
 * O(1) - constant time
 * O(N) - linear time
 * O(log N) - logarithmic time
 * O(N^2) - quadratic time
 * O(N log N) - N log N time
 */
public class Chapter9Arrays {
    public static char[][] routeCipher()    {
        char[][] grid = new char[6][10];
        grid[0][0] = 32;
        int start = 63;
        for(int r = 0; r < grid.length; r++) {
            for(int c = 0; c < grid[r].length; c++) {
                grid[r][c] = (char)start++;
            }
        }
        grid[0][0] = 32;
        return grid;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] nums2 = new int[3];
        nums2[0] = 1;
        nums2[1] = 2;
        nums2[2] = 3;
        String[] frenz = {"Micah", "Philip", "Fran"};
        String[] frenz2 = new String[3];
        frenz2[0] = new String("Ethan");
        System.out.println(frenz[1]);


        System.out.println(frenz[' ']);

        char[][] ticTacBoard = {{'X','X','X'},{'O','X','O'},{'X','O','O'}};

        for(char[] row : routeCipher())
            System.out.println(Arrays.toString(row));
    }
}
