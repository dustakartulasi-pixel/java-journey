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
        Parent ref1 = new child1();
        Parent ref2 = new child2();
        ref1.display1();
        ref1.display2();
        ref2.display1();
        ref2.display2();
        child1 ref11 = (child1) ref1;
        child2 ref22 = (child2) ref2;
        ref11.display3();
        ref22.display3();
    }
}
