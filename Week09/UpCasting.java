package Week09;

class Animal {
    void eat() {
        System.out.println("eating");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("eating");
    }
}

public class UpCasting {
    public static void main(String[] args) {
        Animal ref = new Dog();
        ref.eat();
        ref.eat();
    }
}
