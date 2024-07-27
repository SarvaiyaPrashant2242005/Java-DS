import java.util.*;

public class ArraysExample {

    // Passing an array as an argument
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    // Linear Search
    public static void linearSearch(int marks[], int n) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == n) {
                System.out.println(n + " is found at index number: " + i);
                return; // Exit once the element is found
            }
        }
        System.out.println(n + " is not found in the array.");
    }

    // Largest number from an array
    public static void largest(int marks[]) {
        int largest = marks[0];
        for (int i = 1; i < marks.length; i++) { // Start from index 1 since largest is already marks[0]
            if (marks[i] > largest) {
                largest = marks[i];
            }
        }
        System.out.println("Largest element in the given array is: " + largest);
    }

    // Binary Search
    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // Prevents overflow

            if (numbers[mid] == key) {
                return mid;
            } else if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; // Key not found
    }
    // Reverse an array
    public static void reverse(int[] numbers) {
        int reverse[] = new int[numbers.length];
        System.out.print("everse of number array : " );
        for(int i = 0; i < numbers.length; i++) {
            reverse[i] = numbers[numbers.length - 1 - i];
        }
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(","+ reverse[i]);
        }
        System.out.println();
    }
    
// Print the pairs of an array
    public static void pairs(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            int current = numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+current+","+numbers[j]+")" );
            }
        }
    }

    // Subarrays
    public static void subarrays(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+ " ");
                }
          System.out.println();
        }
        System.out.println();
    }
        
    }
    public static void main(String[] args) {
        // int marks[] = new int[5];
        int marks[] = {97, 98, 99, 80, 55, 28, 100, 67, 57};
        int numbers[] = {2, 4, 6, 8};
        int key = 12;
        pairs(numbers);
        largest(marks);
        linearSearch(marks, 99);
        update(marks);
        largest(marks);
        reverse(marks);
        reverse(numbers);
        subarrays(numbers);
        int binarySearchResult = binarySearch(numbers, key);
        if (binarySearchResult != -1) {
            System.out.println("Key " + key + " is found at index: " + binarySearchResult);
        } else {
            System.out.println("Key " + key + " is not found in the array.");
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Element " + i + " is " + marks[i]);
        }
    }
}
