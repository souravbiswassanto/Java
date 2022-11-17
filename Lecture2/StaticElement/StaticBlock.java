package Lecture2.StaticElement;

public class StaticBlock {
    static int a = 5;
    static int b;
    static {
        b = a * 5;
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);

    }
}
