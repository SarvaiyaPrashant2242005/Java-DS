public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.eatMeat();
        bear.eatGrass();
    }
}

interface Herbivore {
    void eatGrass();
}

interface Carnivore {
    void eatMeat();
}

class Bear implements Herbivore, Carnivore {
    public void eatMeat() {
        System.out.println("Bear eats meat.");
    }

    public void eatGrass() {
        System.out.println("Bear eats grass.");
    }
}
