class dinesh {
    public int x = 100;
    private int y = 100;

    void fun1() {
        System.out.println("fun1");
    }
  
    void fun2() {
        System.out.println("fun2");
    }
}

class firstobj {
    public static void main(String a[]) {
        System.out.println("hi");
        dinesh ds = new dinesh();
        ds.fun1();
        ds.fun2();
        System.out.println(ds.x);
    }
}
