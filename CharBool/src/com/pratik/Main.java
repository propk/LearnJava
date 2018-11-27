package com.pratik;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char myChar = 'A'; // 2bytes
        char myUnicode = '\u00A9'; //unicode support format

        System.out.println("unicode = " + myUnicode);

        boolean myBoolean = false;

        String myString = "Pratik";

        System.out.println("String = " + myString);

        myString = myString + " Kumar, 25";

        System.out.println("String = " + myString);

        String laststring = "10";
        int myInt = 50;

        laststring = laststring + myInt;

        System.out.println(laststring);

    }
}
