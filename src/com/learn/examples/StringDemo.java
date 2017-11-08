package com.learn.examples;

/**
 * Created by Owner on 08.11.2017.
 */
public class StringDemo {
    public static void main(String[] args) {
        stringDemo3();
    }

    static void stringDemo1() {
        String strObj1 = "The first string";
        String strObj2 = "a econd string.";
        String strObj3 = strObj1 + " and " + strObj2;

        System.out.println(strObj1);
        System.out.println(strObj2);
        System.out.println(strObj3);
    }

    static void stringDemo2() {
        String strObj1 = "The first string";
        String strObj2 = "a econd string.";
        String strObj3 = strObj1;

        System.out.println("Length strObj1: " + strObj1.length());

        System.out.println("Symbol as index 2 in strObj1: [" + strObj1.charAt(2) + "]");

        if ( strObj1.equals(strObj2)) {
            System.out.println("strObj1 == strObj2");
        } else {
            System.out.println("strObj1 != strObj2");
        }

        if ( strObj1.equals(strObj3) ) {
            System.out.println("strObj1 == strObj3");
        } else {
            System.out.println("str1 != strObj3");
        }
    }

    static void stringDemo3() {
        String str[] = {"First", "Second", "Third"};

        for (int i=0; i<str.length; i++) {
            System.out.println("str[" + i + "] : " + str[i]);
        }
    }
}
