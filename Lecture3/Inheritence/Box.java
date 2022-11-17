package Lecture3.Inheritence;

public class Box {
    int height, length, width;

    Box() {
        height = -1;
        width = -1;
        length = -1;
    }
    Box(int oneSide) {
        height = oneSide;
        width = oneSide;
        length = oneSide;
    }

    public Box(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }
    Box(Box old) {
        this.height = old.height;
        this.width = old.width;
        this.length = old.length;
    }
    public void info() {
        System.out.println("this is hello from box");
    }
}
