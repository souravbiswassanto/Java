package Lecture4.AccessModifier;

public class A {
    private int num;
    private String name;
    private int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    A(){
        num=0;
        name ="";
    }
    A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
