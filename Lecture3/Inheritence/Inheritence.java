package Lecture3.Inheritence;

public class Inheritence {
    int age;
    Inheritence(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        A a = new A(10);
        Box old = new Box(3,4,6);
        Box newbox = new Box(old); // Created new objects using copy constructor
        System.out.println(newbox.height);
    }
}

class A extends Inheritence {
    A(int age) {
        super(age);
        System.out.println(age);
    }
}

