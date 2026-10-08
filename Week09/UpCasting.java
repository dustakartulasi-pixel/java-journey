package Week09;

class Animal {
    void eat() {
        System.out.println("eating");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("barking");
    }
}

public class UpCasting {
    public static void main(String[] args) {
        Dog ref = new Dog();
        ref.eat();
        ref.eat();
    }
}
