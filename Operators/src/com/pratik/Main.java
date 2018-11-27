package com.pratik;

public class Main {

    public static void main(String[] args) {

        int newInteger = 50;
        /*  Not allowed integer in conditional statement
        if(newInteger = 50)
            System.out.println("This is an error!");

        if(100)
            System.out.println("This is an error!");
        */

        boolean flag = false;

        if(flag = true) //allowed
            System.out.println("Something is fishy");

        boolean wasCar = flag ? true: false; // same as cpp
    }
}
