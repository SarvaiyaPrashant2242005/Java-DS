import java.util.Scanner;

public class D2_Arrays {
    public static void search(int[][] array, int key) {
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == key) {
                    System.out.println(key + " found at cell number (" + i + ", " + j + ")");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Key not found in the given array");
        }
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        int key = 4;

        int[][] array = new int[n][m];
        Scanner sc = new Scanner(System.in);

        // Input elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Element (" + i + "," + j + ") : ");
                array[i][j] = sc.nextInt();
            }
        }

        // Output elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();  // New line after each row
        }

        search(array, 9);
    }
}
