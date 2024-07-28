import java.util.*;

public class Sorting_Algo {
    // Swap method to swap elements in the array
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Method to print the array
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Bubble Sort algorithm
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    // Selection Sort algorithm
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < array.length; j++) { // Fixed loop bounds
                if (array[minPos] > array[j]) {
                    minPos = j;
                }
            }
            swap(array, i, minPos); // Use the swap method
        }
    }

    // Insertion Sort algorithm
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) { // Fixed loop bounds
            int current = array[i];
            int previous = i - 1;
            while (previous >= 0 && array[previous] > current) {
                array[previous + 1] = array[previous];
                previous--;
            }
            array[previous + 1] = current;
        }
    }

    public static void main(String[] args) {
        int array[] = {5, 4, 2, 1, 3};
        int p[] = {1, 7, 9, 4, 7};
        int q[] = {9, 8, 45, 11};
        int e[] = {9,8,2,4,6};

        System.out.print("Original array p:");
        print(p);
        bubbleSort(p);
        System.out.print("Bubble Sorted array p:");
        print(p);
        System.out.println();
        System.out.print("Original array q:");
        print(q);
        selectionSort(q);
        System.out.print("Selection Sorted array q:");
        print(q);
        System.out.println();
        System.out.print("Original array:");
        print(array);
        insertionSort(array);
        System.out.print("Insertion Sorted array:");
        print(array);

        
        System.out.print("Original array:");
        print(e);
        Arrays.sort(e ,1,3);
        System.out.print("Sorted array:");
        print(e);

    }
}
