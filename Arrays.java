import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        int marks[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter marks of student " + (i + 1) + ":");
            marks[i] = sc.nextInt();
        }
        for(int i=0;i<4;i++){
            System.out.println(marks[i]);
        }
    }
}
