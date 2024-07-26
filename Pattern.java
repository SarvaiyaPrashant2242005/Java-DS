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
    
    //Inverted Pyramid
    // Visualize in matrix 4x4
    // lines = 4
    // space + stars
    //    *   space = 3;star=1
    //   **   space = 2; stars = 2
    //  ***   space = 1;stars = 3
    // ****   space = 0;stars = 4
    // row number= star number
    // space = 4-i
    // first space then star
    int k=5;
        for(int i=1;i<=k;i++){
            // Space
            for(int j=1;j<=k-i;j++){
                System.out.print(" ");
            }
            // Stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            
            }
            System.out.println("");
        }
    // Inverted half pyramid with numbers

    // lines = 5
    // 12345 i=1; 1 to 5  n-i+1
    // 1234  i=2; 1 to 4  
    // 123   i=3; 1 to 3
    // 12    i=4; 1 to 2
    // 1     i=5 1

    // Innerloop == strts from 1
    // 

    for(int i=1;i<=5;i++){
        for(int j=1;j<=5-i+1;j++){
            System.out.print(j);
        }
        System.out.println();
    }

    // Floyd's Algoritham
    // lines = 4
    // Counter = 1
    // 1       i=1;p=1
    // 23      i=2;p=c+1,c+2
    // 456     i=3;p=c+3,c+4,c+5   
    // 78910   i=4;p=c+6,c+7,c+8,c+9
    int Counter = 1;
    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.err.print(Counter);
            Counter++;
        }
        System.out.println();

    }

    // Binary Triangle
    // 1          i=1;1
    // 01         i=2;0,1
    // 101        i=3,1,0,1,
    // 0101       i=4;0,1,0,1,
    // 10101      i=5; 1,0,1,0,1

    // sum(i,j) = even print 1
    // sum(i,j) = odd print 0

    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            if((i+j) %2 == 0){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
    }
    System.out.println();   
   }
}}


