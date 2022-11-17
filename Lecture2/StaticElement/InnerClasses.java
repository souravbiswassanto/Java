package Lecture2.StaticElement;

public class InnerClasses {
    // Top class can't be static as it don't depend on any class
    static class Main{
        String name;

        public Main(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        //InnerClasses obj = new InnerClasses();

    }
}
