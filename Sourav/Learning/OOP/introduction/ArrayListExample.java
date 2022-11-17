package Sourav.Learning.OOP.introduction;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // size() returns the size of arraylist
        // isEmpty() returns true or false
        // contains(obj) returns true if obj is present in arrayList.
        // indexOf(obj) returns index number of first appearance obj, if not present then returns -1
        // lastIndexOf(obj) return last index number of obj, -1 instead
        // clone() copy the instance of arraylist obj
        // get(int index) returns the object at index
        // set(int index, int val); sets the value of arraylist.
        // add(obj) add objects at the end of the arraylist
        // add(int index, obj) adds a value at the specified
        // remove(int index) remove the value at index ar returns the value at this index
        list.add(5);
        list.add(5);
        System.out.println(list.indexOf(5));
        System.out.println(list.lastIndexOf(5));
        System.out.println(list.get(1));
        System.out.println(list.set(1, 6));
        for (int x: list){
            System.out.println(x);
        }
    }
}
