import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        // Swapping the elements at idx1 and idx2
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        // Print the ArrayList
        System.out.println("ArrayList: " + list);

        // Print elements in forward order
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.err.println();

        // Print elements in reverse order
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + ", ");
        }
        System.err.println();

        // Find and print the maximum number from the ArrayList
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.err.println("Maximum number from the ArrayList == " + max);

        // Swap elements at index 2 and 4
        int idx1 = 2;
        int idx2 = 4;
        swap(list, idx1, idx2);

        // Print the ArrayList after the swap
        System.out.println("ArrayList after swapping elements at index " + idx1 + " and " + idx2 + ": " + list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("ArrayList after sorting: " + list);

        
    }
}
