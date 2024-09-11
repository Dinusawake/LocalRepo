class Area {
    static void fun1() {
        System.out.println("Area 1");
    }

    static void fun2() {
        System.out.println("Area 2");
    }
}

class hello {

    static void fun1() {
        System.out.println("Fun1");
    }

    static void fun2() {
        System.out.println("fun2");
    }

    public static void main(String a[]) {
        hello.fun1();
        hello.fun2();
        System.out.println("In Main");
        Area.fun1();
        Area.fun2();
    }
}