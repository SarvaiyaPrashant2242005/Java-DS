public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Prashant");
        Student s2 = new Student();
        Student s3 = new Student(3);
        Student s4 = new Student("Harsh", 5);

        s1.name = "Prashant";
        s1.roll = 123;
    }
    
}
class Student{
    String name;
    int roll;
    // Constructor Overloading///

    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;

    }
    //Non parameterized Constructir
    Student(){
        System.out.println("Constructor is called...");
    }
    //PArameterize Constructoir
    Student(String name){
        this.name = name;
        System.out.println(this.name);
    }
    Student(int roll){
        this.roll = roll;
        System.out.println(this.roll);
    }
    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
        System.out.println("Student name : " + this.name + " and  Roll number : " + this.roll);

    }
}
