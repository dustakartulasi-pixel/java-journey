package Week09;

class Parent {
    void display1() {
        System.out.println("Inside Parent display1");
    }

    void display2() {
        System.out.println("Inside Parent display2");
    }
}

class child1 extends Parent {
    @Override
    void display1() {
        System.out.println("Inside child1 display1");
    }

    void display2() {
        System.out.println("Inside child1 display2");
    }

    void display3() {
        System.out.println("Inside child1 display3");
    }
}

class child2 extends Parent {
    @Override
    void display1() {
        System.out.println("Inside child2 display1");
    }

    void display2() {
        System.out.println("Inside child2 display2");
    }

    void display3() {
        System.out.println("Inside child2 display3");
    }
}

public class DownCasting {
    public static void main(String[] args) {
        Parent ref = new child2();
        ref.display1();
        ref.display2();
        child1 ref1 = (child1) ref;
        ref1.display3();
    }
}
