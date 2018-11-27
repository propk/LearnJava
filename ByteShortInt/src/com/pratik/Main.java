package com.pratik;

public class Main {

    public static void main(String[] args) {

        int myLiteral = 1_234_572_980; // readability
        int myInteger = 1090; // 32bit

        int myIntValue = (myLiteral/2);

        byte myByte = 127; // 8bit
        byte myFinalByte = (byte) (myByte/2); // need typecasting else considered as int

        short myShortValue = -32768; // 32bit
        short myNewShoerValue = (short) (myShortValue/2);
        short myAdditiveShort = (short) (myShortValue + 5);

        long myLongValue = 991_345_123_123_234L; // 64 bit

        long mySumLongValue = myLongValue + myFinalByte + myAdditiveShort + myInteger + 10L * myIntValue ;

        System.out.println("Long Total " + mySumLongValue);

    }
}
