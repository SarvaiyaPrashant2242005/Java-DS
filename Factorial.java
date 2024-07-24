public class Factorial {
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f = f* i ;
        }
        return f;
    }
    public static void main(String args[]){
        int n = 2;
        int p = factorial(n);
        System.out.println("Factorial of "+ n + " is : "+ p);
    }
    
}
