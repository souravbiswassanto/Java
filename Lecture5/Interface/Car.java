package Lecture5.Interface;

public class Car implements Media, Brake, Engine{

    @Override
    public void brake() {
        System.out.println("Brake");
    }

    @Override
    public void engineStart() {
        System.out.println("Start Engine");
    }

    @Override
    public void engineStop() {
        System.out.println("Stop Engine");
    }

    @Override
    public void engineAccelerate() {
        System.out.println("Accelerate");
    }


    @Override
    public void mediaStart() {
        System.out.println("Media Start");
    }

    @Override
    public void mediaStop() {
        System.out.println("Media Stop");
    }
}
