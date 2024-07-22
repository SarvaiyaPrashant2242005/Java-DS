// Print Star Pattern
// ****
// ***
// **
// *

// What to think ?
// 1) How many lines to print? --> Outer loop (4 times)
// 2) Numbers of starts ====> Inner loop (line number = Start count)   (i times)
// 3) What to print?




import java.util.*;

public class Pattern {
    public static void main(String[] args) {
         int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // ****
        // ***
        // **
        // *

        // What to think ?
        // 1) How many lines to print? --> Outer loop (4 times)
        // 2) Numbers of starts ====> Inner loop (line number = Start count)   (n-i times)
        // 3) What to print?

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Half Pyramid
        // 1
        // 12
        // 123
        // 1234
        // 1) How many lines to print? --> Outer loop (4 times)
        // 2) Numbers of starts ====> Inner loop (line number)
        // 3) What to print? ====> Number (Inner loop count)

        for(int i = 1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        // Print Character PAttern
        // A
        // BC
        // DEF
        // GHIJ
        // 1) How many lines to print? --> Outer loop (4 times)
        // 2) Numbers of starts ====> Inner loop (line number)
        // 3) What to print? ====> Alfabet (Inner loop count)
        char ch='A';


        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

   }
}


