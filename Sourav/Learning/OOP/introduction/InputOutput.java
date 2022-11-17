package Sourav.Learning.OOP.introduction;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int input
        int _int = sc.nextInt();
        long _longInt = sc.nextLong();
        System.out.println(_int + " " + _longInt);
        // inputting the whole line
        String str = sc.nextLine();
        //String ch = sc.next(); // this will take the first one as input
        //System.out.println(str);

        // inputting float
        float fraction = sc.nextFloat();
    }
}
