class Area {
    void fun1() {
        System.out.println("Area 1");
    }

     void fun2() {
        System.out.println("Area 2");
    }

}

class Example {

    static void fun1() {
        System.out.println("A");
    }

    static void fun2() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        System.out.println("C");
        // Example ex = new Example();
        Example.fun1();
        Example.fun2();

        Area area = new Area();
        area.fun1();
        area.fun2();
    }
}
