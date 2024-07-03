package Week2;

class Example {
    private int x;
    private int y;

    Example(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class q5 {
    public static void main(String[] args) {
        Example obj = new Example(1, 2);
        System.out.println("x: " + obj.getX() + ", y: " + obj.getY());
    }
}
