import java.util.*;
public class Functions {
    public static void printHW(){
        System.out.println("Hello World");
    }

    public static int Sum(int a,int b){
        int sum = a+b;
        return sum;
    }


    public static void main(String[] args) {
        printHW();
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int p = Sum(a,b);
    System.out.println("Ans = " + p);
    
    }
    
}
