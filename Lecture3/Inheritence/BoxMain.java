package Lecture3.Inheritence;

public class BoxMain {
    public static void main(String[] args) {
        Box box1 = new Box(2,3,5);
        BoxWeight box2 = new BoxWeight(2,3,4,5);
        System.out.println(box2.height);
        System.out.println(box2.weight);

        Box box3 = new BoxWeight(2,3,4,5);
        System.out.println(box3.height);
        //System.out.println(box3.weight); THis won't work
        // why possible? mentioned in khata.

        // BoxWeight box4 = new Box(2,3,4);
        // Not possible. Why?
        //There are many variables in both parent and child classes.
        // You are given access to variables in the reference type BoxWeight. So you should be able
        // to access all the variables of reference type BoxWeight box4.
        // Hence you should be able to access weight variable.
        // THis also means that the variable that you are trying to access should be initialised also.
        // but how can you initialise weight variable in BoxWeight? the constructor is provided inside
        // boxweight class. but constructor being called here is Box constructor, that can't run
        // boxweight constructor. hence you can't create box4 object.

        // Multilevel inheritence
        BoxWeightPrice box5 = new BoxWeightPrice(2,3,4,5,6);
        System.out.println(box5.height);
        System.out.println(box5.price);
        System.out.println(box5.weight);

        BoxWeight box6 = new BoxWeightPrice(2,3,4,5,6);
        System.out.println(box6.weight);
        System.out.println(box6.height);
        BoxWeightPrice box7 = new BoxWeightPrice(box5);
        System.out.println(box7.price);
        BoxWeight box8 = new BoxWeightPrice(box5);
        System.out.println(box8.weight);
    }
}
