import java.util.*;

public class Sorting_Algo {
    // Swap method to swap elements in the array
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Bubble Sort algorithm
    public static void Bubble_Sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    // 

    // Method to print the array
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = {5, 4, 2, 1, 3};
        
        System.out.println("Original array:");
        print(array);

        Bubble_Sort(array);

        System.out.println("Sorted array:");
        print(array);
    }
}
