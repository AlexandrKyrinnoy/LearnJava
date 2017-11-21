package com.learn.examples;

import com.learn.classRepository.DynStack;
import com.learn.classRepository.FixedStack;
import com.learn.classRepository.IntStack;

/**
 * Created by Owner on 21.11.2017.
 */
public class IFTestDemo {
    public static void main(String[] args) {
        //forFixedStackDemo();
        //forDynStackDemo();
        forStaticDynamicStackDemo();
    }

    private static void forFixedStackDemo() {
        FixedStack myStack1 = new FixedStack(5);
        FixedStack myStack2 = new FixedStack(8);

        for(int i=0; i<5; i++) myStack1.push(i);
        for(int i=0; i<8; i++) myStack2.push(i);

        System.out.println("Stack in myStack1:");
        for(int i=0; i<5; i++){
            System.out.print(myStack1.pop()+" ");
        }
        System.out.println("\nStack in myStack2:");
        for(int i=0; i<8; i++) {
            System.out.print(myStack2.pop()+" ");
        }
    }

    private static void forDynStackDemo() {
        DynStack dynStack1 = new DynStack(5);
        DynStack dynStack2 = new DynStack(8);

        for(int i=0; i<12; i++) dynStack1.push(i);
        for(int i=0; i<20; i++) dynStack2.push(i);

        System.out.println("Stack in dynStack1:");
        for(int i=0; i<12; i++) System.out.print(dynStack1.pop()+" ");

        System.out.println("\nStack in dynStack2:");
        for(int i=0;i<20;i++) System.out.print(dynStack2.pop()+" ");
    }

    private static void forStaticDynamicStackDemo() {
        IntStack myStack;
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        myStack = ds;
        for(int i=0; i<12; i++) myStack.push(i);

        myStack = fs;
        for(int i=0; i<8; i++) myStack.push(i);

        myStack = ds;
        System.out.println("In dynamic stack:");
        for(int i=0; i<12; i++) System.out.print(myStack.pop()+" ");

        myStack = fs;
        System.out.println("\nIn fixed stack:");
        for(int i=0; i<8; i++) System.out.print(myStack.pop()+" ");

    }
}
