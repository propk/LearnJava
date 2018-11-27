package com.pratik;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myInteger = 5;

        // float is 32 bit
        float myFLoat = 5.454f;
        float myNewFloat = (float) 5.46; // 'f' or typecasting required

        // double is 64 bit - prefer use double not float
        // more precise
        double myDouble = 5.213d;
        double myCOrrectDouble = 5.123; // no specification allowed for double

        System.out.println("muIntValue " + myInteger / 3);
        System.out.println("myNewFloat " + myNewFloat / 3);

        double pi = 3.14_192_197d; // as literal

    }
}
