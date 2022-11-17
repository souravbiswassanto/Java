package Lecture2.StaticElement;
import Lecture2.StaticElement.Human;
public class Main {
    public static void main(String[] args) {
        Human sourav = new Human("Sourav", 26, 20000, "16CSE018");
        Human santo = new Human("Santo", 26, 20000, "16CSE018");
        System.out.println(sourav.people);
        System.out.println(santo.people);
        System.out.println(sourav.population);
        System.out.println(santo.population);
        Main obj = new Main();
        obj.greeting();

    }

    public void greeting() {
        meet();
        System.out.println("Greetings!!");
    }
    public void meet() {
        System.out.println("we don't meet yet!");
    }
}
