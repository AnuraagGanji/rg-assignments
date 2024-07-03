package Week2;

class Single {
    private static final Single obj = new Single();

    private Single(){}

    public static Single getInstance() {
        return obj;
    }
}

public class q4 {
    public static void main(String[] args) {
        Single obj1 = Single.getInstance();
        Single obj2 = Single.getInstance();

        System.out.println("obj1: " + obj1 + ", obj2: " + obj2);
    }
}
