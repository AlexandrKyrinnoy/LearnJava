package com.learn.classRepository;

/**
 * Created by Owner on 08.11.2017.
 */
public class Outer {
    int outerX = 100;

    public void test() {
         CRInner inner = new CRInner();
         inner.display();
    }

    class CRInner {
        void display() {
            System.out.println("outerX: " + outerX);
        }
    }
}
