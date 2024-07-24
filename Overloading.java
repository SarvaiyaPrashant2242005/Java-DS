public class Overloading {
    //Overloading Usign parameters
    public static int sum(int a,int b){
        int s = a+b;
        System.out.print("1 is called & sum is : ");
        return s;
    }
    public static int sum(int a,int b,int c){
        int s = a+b+c;
        System.out.print("2 is called & sum is : ");
        return s;
    }
    //Overloading Usign parameters
    public static double sum(double a,double b){
        double s = a+b;
        System.out.print("3 is calleed & sum is : ");
        return s;
    }
    public static void main(String args[]){
        int a = 5;
        int b = 10;
        int c = 15;
        double d = 1.9;
        double e = 1.8;

        System.out.println(sum(a,b));
        System.out.println(sum(a,b,c));
        System.out.println(sum(d,e));

    }
}
