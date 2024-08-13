public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();
        Dog d1 = new Dog();
        d1.eat();
        d1.legs = 4;
    System.out.println(d1.legs);

    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breath() {
        System.out.println("Breaths");
    }
}

// class Fish extends Animal {
//     int fins;

//     void swim() {
//         System.out.println("Swims");
//     }
// }
class Mamels extends Animal {
    int legs;
}
class Dog extends Mamels{
    String breate;
}