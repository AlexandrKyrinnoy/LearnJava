package com.learn.examples;


/**
 * Created by Owner on 08.11.2017.
 */
public class VAPassArrayExample {
    static void vaTest1(int v[]) {
        System.out.print("Number of args: " + v.length + ", Contains: ");
        for(int x: v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest2(int ... v) {
        System.out.print("Number of args: " + v.length + ", Contains: ");
        for(int x: v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void VAPassArrayExampleDemo1() {
        int n1[] = {10};
        int n2[] = {11, 12, 13};
        int n3[] = {};

        vaTest1(n1);
        vaTest1(n2);
        vaTest1(n3);
    }

    static void VAPassArrayExampleDemo2() {
        vaTest2(20);
        vaTest2(21, 22, 23, 24);
        vaTest2();
    }


    public static void main(String[] args) {
        VAPassArrayExampleDemo2();
    }
}
