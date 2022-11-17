package Lecture5.Abstract;

public class ChildClass extends ParentAbstractClass{

    @Override
    void career(String car) {
        System.out.println("I  want to be " + car);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love " + name + " and her age is " + age);
    }
}
