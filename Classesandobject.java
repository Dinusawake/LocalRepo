class Nokia {
    private int mic;
    private int cam;

    void setValue() {
        mic = 2;
        cam = 40;
    }

    void disaply() {
        System.out.println(mic);
        System.out.println(cam);
    }
}

public class Classesandobject {

    public static void main(String a[]) {
        Nokia n = new Nokia();
        n.disaply();
        n.setValue();
        n.disaply();
    }
}
