package Lecture2.StaticElement;

public class Human {
    String name;
    int age;
    int salary;
    String ID;
    long people; // simple variable
    static long population; // static variable. doesn't depend on the object. common for all object.
    // a properties for a class
    public Human(String name, int age, int salary, String ID) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.ID = ID;
        this.people += 1; // printing this in main class would result in 1 no matter how much of object you create.
        Human.population += 1; // this will update each time a new object will be created.
    }
    public void printName() {
        System.out.println(this.name);
    }
}
