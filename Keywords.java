public class Keywords {
    public static void main(String[] args) {
        // // Static Keyword
        // Student s1 = new Student();
        // s1.School = "Marwadi";

        // Student s2 = new Student();
        // System.out.println(s2.School);  // This will print "Marwadi"


        //  // SUper Keyword
        Horse h1 = new Horse();
        System.out.println(h1.Color);
        
    }
}

// //Static Keyword

// class Student {
//     String name;
//     int roll;
//     static String School;

//     void setName(String name) {
//         this.name = name;
//     }

//     String getName() {
//         return this.name;
//     }
// }

// Super keyword

class Animal{
    String Color;
    Animal(){
        System.out.println("Constructor is called");
    }
}
class Horse extends Animal{
   
    Horse(){
        super.Color = "Brown";
        System.out.println("Horse is called");

    }
}