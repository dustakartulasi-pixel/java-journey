package Week12;

class Os {
    Os() {
        System.out.println("Os installed");
    }

    void CheckOs() {
        System.out.println("OS is still executing...");
    }
}

class Mobile {
    Os o = new Os();

    Mobile() {
        System.out.println("Mobile created with OS");
    }
}

public class Main {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.o.CheckOs();
        m = null;
    }

}
