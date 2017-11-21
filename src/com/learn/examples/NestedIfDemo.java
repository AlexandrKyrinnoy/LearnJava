package com.learn.examples;

/**
 * Created by Owner on 21.11.2017.
 */
class A {
    public interface NestedIf {
        boolean isNotNegative(int x);
    }
}

class B implements A.NestedIf {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}

public class NestedIfDemo {
    public static void main(String[] args) {
        A.NestedIf nif = new B();

        if ( nif.isNotNegative(10) ) {
            System.out.println("10 is not negative");
        }
        if ( nif.isNotNegative(-12) ) {
            System.out.println("-12 - is negative, this text are not display!");
        }
    }
}
