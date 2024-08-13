public class AbstractionExample {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        h.ChangeColor();
        System.out.println(h.Color);

        Monkey m = new Monkey();
        m.eat();
        m.walk();
        m.ChangeColor();
        System.out.println(m.Color);
    }
}

abstract class Animal {
    String Color;

    Animal() {
        Color = "Peach Color";
    }

    void eat() {
        System.out.println("Animal can eat");
    }

    abstract void walk();
}

class Horse extends Animal {
    void ChangeColor() {
        Color = "Yellow";
    }

    void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

class Monkey extends Animal {
    void ChangeColor() {
        Color = "Red";
    }

    void walk() {
        System.out.println("Monkey walks on 2 legs");
    }
}
